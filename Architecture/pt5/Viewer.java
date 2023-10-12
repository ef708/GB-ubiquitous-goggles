package GB.Architecture.pt5;

public class Viewer {

    class OpenedFile{
        String path;
        String metadata;
        int[] figureParameters = new int[10];
    }

    class Figure{

    }

    boolean isInViewMode = true;

    void OpenFile(String filepath){};
    void CloseFile(){};
    void MakeNewFile(){};
    void MakeBaseFigure(String shape){};
    void ChangeFigureSize(Figure figure, double newSize){};
    void ChangeFigureShape(Figure figure){};
    void ChangeFigureParameters(Figure figure, int figureParameter, int newValue){};

    ModelRenderer Renderer = new ModelRenderer();
}
