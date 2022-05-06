package models;
/*import java.util.Properties;
import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.internet.MimeMessage;*/
public class Personal_Info {

    private String name;
    private String email;
    private String password;
    private String title;

//	public Personal_Info() {
//		this.name = "ex:ahmed";
//		this.email = "xxxxxxxx@gmail.com";
//		this.password = "xxxxxxxxxx ";
//		this.title = "Mr. ";
//	}


    public Personal_Info(String name, String email, String password, String title) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.title = title;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }

//	public static void sendMait(String recepient) throws Exception{
//        System.out.println("Message sent successfully");
//	 Properties properties = new Properties ();
//	 properties.put ("sait.setp.auth", "true");
//	 properties.put("ail.setp.starttls.enable", "true");
//	 properties.put ("ail, setp.host", "setp.gnail.com");
//	 properties.put("ail.setp.port", "587");
//	 String email = "xxxxx@gmail.com";
//	 String password = "xxxxxxx";
//	 Session session=Session.getInstance(properties, new Authenticator (){
//	    @override
//	    protected PasswordAuthentication getPasswordauthentication() {
//	        return new PasswordAuthentication(email, password) }});
//
//
//	 Message message  = prepareMessage (session, email, recepient);
//	 Transport.sendLessage
//	 System.out-println( "Message sent successfully");
//	private static Message preporenessoge(Session session, String mykccountEnail, String recepient){
//	 try {
//	    Message message =  new MimeMessage(session);
//	    message.setFrom(new InternetAddress (email));
//	    message.setRecipient (Message.Recipient Type. TO, new Internetaddress(recepient));
//	    message.setSubject ("My First Enail from Java App"):
//	    message.setText("Hey There, \n Lookyenaili"):
//	    return message;
//	   }catch (Exception ex){
//	    Logger gettogger (Javakai lutil.class. getName()). log(Level.SEVERE, null, ex):
//	 return null;




}
