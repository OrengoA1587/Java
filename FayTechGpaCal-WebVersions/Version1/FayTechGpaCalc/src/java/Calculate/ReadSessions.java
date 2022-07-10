package Calculate;

import java.io.*;
import javax.servlet.http.*;

public class ReadSessions extends HttpServlet {
    public void getPost(HttpServletRequest request, HttpServletResponse response, HttpSession session){
        try{
            
            String uid = (String)session.getAttribute("gpaScore");
            if(uid == null){
                //response.sendRedirect("javascript:history.go(-1)");
                response.sendRedirect("notAdminAvailable.jsp");
            }
            else{
                session.setAttribute("gpaScore", uid);
            }
        }
        catch(IOException exp){
            System.out.println(exp);
        }
    }
}