package abstractFactory;

public class MacFactory implements GUIFactory{
    @Override
    public AppButton createButton() {
        return new MacButton();
    }

    @Override
    public AppCheckBox createCheckBox() {
        return new MacCheckbox();
    }
}
