public class NetflixShow {

    private String showName;
    private int viewCount;

    public String getShowName() {
        return showName;
    }//

    public void setShowName(String showName) {
        this.showName = showName;
    }

    public int getViewCount() {
        return viewCount;
    }

    public void setViewCount(int viewCount) {
        this.viewCount = viewCount;
    }

    public NetflixShow(String showName, int viewCount) {
        this.showName = showName;
        this.viewCount = viewCount;
    }


    public String toString() {
        String result = "";

        result += String.format ("%50s%-20d", showName,viewCount);

        return result;
    }// end of toString() method

    public String forFile(){

        String result = "";
        result += showName + ";" + viewCount;
        return result;
    }//end of forFile() method


    public void cleanShowName (){

        while (showName.contains("?")){
           showName = showName.replace("?","");
        }//end of while

        while (showName.contains("/")){
            showName = showName.replace("/","");
        }//end of while

        while (showName.contains("  ")){
          showName =  showName.replace("  ","");
        }//end of while

        while (showName.contains("�")){
            showName =  showName.replace("�","");
        }//end of while
    }// end of cleanShowName


}// end of NetflixShow class
