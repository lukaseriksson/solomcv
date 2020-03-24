/**
 * Created by magnus on 2017-01-27.
 */
public class MVCSolo {
    public static void main(String[] args) {
        SoloView theView = new SoloView();
        SoloModel theModel = new SoloModel();
        SoloController theController = new SoloController(theView,theModel);
        theView.setVisible(true);
    }
}