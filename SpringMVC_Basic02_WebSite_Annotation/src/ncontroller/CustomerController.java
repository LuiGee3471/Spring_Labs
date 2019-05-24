package ncontroller;

import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.commons.CommonsMultipartFile;
import org.springframework.web.servlet.ModelAndView;

import dao.NoticeDao;
import vo.Notice;

@Controller
@RequestMapping("/customer/")
public class CustomerController {
  private NoticeDao noticeDao;
  
  @Autowired
  public void setNoticeDao(NoticeDao noticeDao) {
    this.noticeDao = noticeDao;
  }
  
  @RequestMapping("notice.htm")
  public ModelAndView showNotices(
      @RequestParam(name = "pg", defaultValue = "1") int page,
      @RequestParam(name = "f", defaultValue = "TITLE") String field,
      @RequestParam(name = "q", defaultValue = "%%") String query) throws ClassNotFoundException, SQLException {
    
    List<Notice> list = noticeDao.getNotices(page, field, query);
    ModelAndView mav = new ModelAndView("notice.jsp");
    mav.addObject("list", list);
    
    return mav;
  }
  
  @RequestMapping("noticeDetail.htm")
  public ModelAndView showNoticeDetail(String seq) throws ClassNotFoundException, SQLException {
    Notice notice = noticeDao.getNotice(seq);
    ModelAndView mav = new ModelAndView("noticeDetail.jsp");
    mav.addObject("notice", notice);
    
    return mav;
  }
  
  @RequestMapping(path = "noticeReg.htm", method = RequestMethod.GET)
  public String showWritePage() {
    return "noticeReg.jsp";
  }
  
  @RequestMapping(path = "noticeReg.htm", method = RequestMethod.POST)
  public String submitNotice(Notice notice, HttpServletRequest request) throws IOException, ClassNotFoundException, SQLException {  
    CommonsMultipartFile uploadedFile = notice.getFile();  
    notice.setFileSrc(uploadedFile.getOriginalFilename());
    
    String filename = uploadedFile.getOriginalFilename();
    String path = request.getServletContext().getRealPath("/upload");
    String filepath = path + "\\" + filename;
    
    FileOutputStream fos = new FileOutputStream(filepath);
    fos.write(uploadedFile.getBytes());
    fos.close();
    
    noticeDao.insert(notice);
    
    return "redirect:notice.htm";
  }
  
  @RequestMapping("noticeDel.htm")
  public String deleteNotice(String seq) throws ClassNotFoundException, SQLException {
    noticeDao.delete(seq);
    
    return "redirect:notice.htm";
  }
}
