package make.appaplication;
import java.io.Serializable;
import java.util.ArrayList;


public class DataModel implements Serializable {


    String imgUrl;
    String question;
    ArrayList<String> options;

    public DataModel(String imgUrl, String question, ArrayList<String> options) {
        this.imgUrl = imgUrl;
        this.question = question;
        this.options = options;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public ArrayList<String> getOptions() {
        return options;
    }

    public void setOptions(ArrayList<String> options) {
        this.options = options;
    }
}



