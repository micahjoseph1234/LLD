package abstractFactory;

public class WindowsFactory implements GUIFactory{
    @Override
    public AppButton createButton() {
        ;return new WindowsButton();
    }

    @Override
    public AppCheckBox createCheckBox() {
        return new WindowsCheckBox();

    }


}
