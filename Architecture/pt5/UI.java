package GB.Architecture.pt5;

public class UI {
    Viewer viewer = new Viewer();
    SaveLoader saveLoader = new SaveLoader();
    Viewer.OpenedFile openedFile = new Viewer().new OpenedFile();
    ConversionHandler conversionHandler = new ConversionHandler();

    public class Button {

    }
    public class redButton extends Button {}{
        viewer.OpenFile("path");
    }

    public class blueButton extends Button {}{
        saveLoader.SaveFile(openedFile, "name");
    }

    public class greenButton extends Button {}{
        conversionHandler.Convert(openedFile, "format");
    }

    public class yellowButton extends Button {}{
        viewer.MakeNewFile();
    }
}
