public class Main {
    public static void main(String[] args) {

        Button buttonOk = new Button();
        buttonOk.setHeight(120);
        buttonOk.setWidth(70);
        buttonOk.setColor("Green");
        buttonOk.setLabel("Ok");

        Button buttonCancel = new Button();
        buttonCancel.setHeight(120);
        buttonCancel.setWidth(70);
        buttonCancel.setColor("Red");
        buttonCancel.setLabel("Cancel");



        Panel panel = new Panel();
        panel.setHeight(800);
        panel.setWidth(600);


        panel.add(buttonCancel);
        panel.add(buttonOk);


        buttonOk.setParent(panel);
        buttonCancel.setParent(panel);


        Window window = new Window();
        window.setHeight(1280);
        window.setHeight(720);
        window.add(panel);
        panel.setParent(window);


        Button closeWindowButton = new Button();
        closeWindowButton.setWidth(100);
        closeWindowButton.setHeight(50);
        closeWindowButton.setLabel("Close Window");
        closeWindowButton.setColor("Grey");

        window.add(closeWindowButton);
        closeWindowButton.setParent(window);

        //controlam toate obiectele doar printr-un singur apel
        window.render();
    }
}