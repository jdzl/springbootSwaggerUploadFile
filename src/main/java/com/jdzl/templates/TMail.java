package com.jdzl.templates;

public class TMail {

    public static String html(String name,String btnMessage,String accountNumber,String URL) {

       return "    <table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" class=\"body\" style=\"border-collapse: separate; mso-table-lspace: 0pt; mso-table-rspace: 0pt; width: 100%; background-color: #f6f6f6;\">\n" +
                "      <tr>\n" +
                "        <td style=\"font-family: sans-serif; font-size: 14px; vertical-align: top;\">&nbsp;</td>\n" +
                "        <td class=\"container\" style=\"font-family: sans-serif; font-size: 14px; vertical-align: top; display: block; Margin: 0 auto; max-width: 580px; padding: 10px; width: 580px;\">\n" +
                "          <div class=\"content\" style=\"box-sizing: border-box; display: block; Margin: 0 auto; max-width: 580px; padding: 10px;\">\n" +
                "\n" +
                "            <!-- START CENTERED WHITE CONTAINER -->\n" +
                "            <span class=\"preheader\" style=\"color: transparent; display: none; height: 0; max-height: 0; max-width: 0; opacity: 0; overflow: hidden; mso-hide: all; visibility: hidden; width: 0;\">This is preheader text. Some clients will show this text as a preview.</span>\n" +
                "            <table class=\"main\" style=\"border-collapse: separate; mso-table-lspace: 0pt; mso-table-rspace: 0pt; width: 100%; background: #ffffff; border-radius: 3px;\">\n" +
                "\n" +
                "              <!-- START MAIN CONTENT AREA -->\n" +
                "              <tr>\n" +
                "                <td class=\"wrapper\" style=\"font-family: sans-serif; font-size: 14px; vertical-align: top; box-sizing: border-box; padding: 20px;\">\n" +
                "                  <table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" style=\"border-collapse: separate; mso-table-lspace: 0pt; mso-table-rspace: 0pt; width: 100%;\">\n" +
                "                    <tr>\n" +
                "                      <td style=\"font-family: sans-serif; font-size: 14px; vertical-align: top;\">\n" +
                "                        <p style=\"font-family: sans-serif; font-size: 14px; font-weight: normal; margin: 0; Margin-bottom: 15px;\">Hello  "+name+",</p>\n" +
                "                        <p style=\"font-family: sans-serif; font-size: 14px; font-weight: normal; margin: 0; Margin-bottom: 15px;\">  Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text account number "+accountNumber+".</p>\n" +
                "                        <table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" class=\"btn btn-primary\" style=\"border-collapse: separate; mso-table-lspace: 0pt; mso-table-rspace: 0pt; width: 100%; box-sizing: border-box;\">\n" +
                "                          <tbody>\n" +
                "                            <tr>\n" +
                "                              <td align=\"left\" style=\"font-family: sans-serif; font-size: 14px; vertical-align: top; padding-bottom: 15px;\">\n" +
                "                                <table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" style=\"border-collapse: separate; mso-table-lspace: 0pt; mso-table-rspace: 0pt; width: auto;\">\n" +
                "                                  <tbody>\n" +
                "                                    <tr>\n" +
                "                                      <td style=\"font-family: sans-serif; font-size: 14px; vertical-align: top; background-color: #3498db; border-radius: 5px; text-align: center;\"> <a href=\" "+URL+"\" target=\"_blank\" style=\"display: inline-block; color: #ffffff; background-color: #3498db; border: solid 1px #3498db; border-radius: 5px; box-sizing: border-box; cursor: pointer; text-decoration: none; font-size: 14px; font-weight: bold; margin: 0; padding: 12px 25px; text-transform: capitalize; border-color: #3498db;\"> "+btnMessage+"</a> </td>\n" +
                "                                    </tr>\n" +
                "                                  </tbody>\n" +
                "                                </table>\n" +
                "                              </td>\n" +
                "                            </tr>\n" +
                "                          </tbody>\n" +
                "                        </table>\n" +
                "                        <p style=\"font-family: sans-serif; font-size: 14px; font-weight: normal; margin: 0; Margin-bottom: 15px;\">Lorem Ipsum is simply dummy text of the printing and typesetting industry..</p>\n" +
                "                        <p style=\"font-family: sans-serif; font-size: 14px; font-weight: normal; margin: 0; Margin-bottom: 15px;\">Regards.</p>\n" +
                "                      </td>\n" +
                "                    </tr>\n" +
                "                  </table>\n" +
                "                </td>\n" +
                "              </tr>\n" +
                "\n" +
                "            <!-- END MAIN CONTENT AREA -->\n" +
                "            </table>\n" +
                "\n" +
                "            <!-- START FOOTER -->\n" +
                "            <div class=\"footer\" style=\"clear: both; Margin-top: 10px; text-align: center; width: 100%;\">\n" +
                "              <table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" style=\"border-collapse: separate; mso-table-lspace: 0pt; mso-table-rspace: 0pt; width: 100%;\">\n" +
                "                <tr>\n" +
                "                  <td class=\"content-block\" style=\"font-family: sans-serif; vertical-align: top; padding-bottom: 10px; padding-top: 10px; font-size: 12px; color: #999999; text-align: center;\">\n" +
                "                    <span class=\"apple-link\" style=\"color: #999999; font-size: 12px; text-align: center;\">Company Inc, San Anotnio rulz 4250</span>\n" +
                "                    <br> Don't like these emails? <a href=\"http://i.imgur.com/CScmqnj.gif\" style=\"text-decoration: underline; color: #999999; font-size: 12px; text-align: center;\">Unsubscribe</a>.\n" +
                "                  </td>\n" +
                "                </tr>\n" +
                "                <tr>\n" +
                "                  <td class=\"content-block powered-by\" style=\"font-family: sans-serif; vertical-align: top; padding-bottom: 10px; padding-top: 10px; font-size: 12px; color: #999999; text-align: center;\">\n" +
                "                    Powered by <a href=\"#\" style=\"color: #999999; font-size: 12px; text-align: center; text-decoration: none;\">jdzl</a>.\n" +
                "                  </td>\n" +
                "                </tr>\n" +
                "              </table>\n" +
                "            </div>\n" +
                "            <!-- END FOOTER -->\n" +
                "\n" +
                "          <!-- END CENTERED WHITE CONTAINER -->\n" +
                "          </div>\n" +
                "        </td>\n" +
                "        <td style=\"font-family: sans-serif; font-size: 14px; vertical-align: top;\">&nbsp;</td>\n" +
                "      </tr>\n" +
                "</table>";
    }
}

