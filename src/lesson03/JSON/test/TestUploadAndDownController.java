package lesson03.JSON.test;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.*;
import java.util.UUID;

/**
 * @author lifei
 * @date 2020/7/20 11:57
 */
@Controller
public class TestUploadAndDownController {
    @RequestMapping("/down")
    public ResponseEntity<byte[]> down(HttpSession session) throws IOException {
        //获取下载文件的路径
        String realPath = session.getServletContext().getRealPath("img");
        String finalPath=realPath+ File.separator+"11.jpg";
        System.out.println(realPath);
        InputStream is=new FileInputStream(finalPath);
        //is.available()获取输入流所读取的文件最大字节数
        byte[] b=new byte[is.available()];
        is.read(b);
        //设置请求头
        HttpHeaders headers=new HttpHeaders();
        //attachment设置以附件形式下载，filename默认的下载文件名
        headers.add("Content-Disposition","attachment;filename=abc.jpg");
        //设置响应状态
        HttpStatus ok = HttpStatus.OK;
        ResponseEntity<byte[]> entity=new ResponseEntity<byte[]>(b,headers,ok);
        is.close();
        return entity;
    }
    @RequestMapping(value = "up_old",method = RequestMethod.POST)
    public String up_old(String desc, MultipartFile uploadFile,HttpSession session) throws IOException {
        //获取上传文件的名称
        String originalFilename = uploadFile.getOriginalFilename();
        String path=session.getServletContext().getRealPath("photo")+File.separator+originalFilename;
        //获取输入流
        InputStream is = uploadFile.getInputStream();
        //获取输出流
        File file=new File(path);
        OutputStream os=new FileOutputStream(file);
        int i=0;
        byte []b=new byte[1024];
        while ((i=is.read(b))!=-1){
            os.write(b,0,i);
        }
        os.close();
        is.close();
        return "success";
    }

    @RequestMapping(value = "up",method = RequestMethod.POST)
    public String up(String desc, MultipartFile uploadFile,HttpSession session) throws IOException {
        //获取上传文件的名称
        String originalFilename = uploadFile.getOriginalFilename();
        String finalFileName= UUID.randomUUID()+originalFilename.substring(originalFilename.lastIndexOf("."));
        String path=session.getServletContext().getRealPath("photo")+File.separator+finalFileName;
        File file=new File(path);
        uploadFile.transferTo(file);
        return "success";
    }
}
