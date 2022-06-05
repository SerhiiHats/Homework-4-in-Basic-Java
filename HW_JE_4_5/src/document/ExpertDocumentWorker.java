package document;

public class ExpertDocumentWorker extends DocumentBase {

    @Override
    public void seeVersion() {
        System.out.println("\u001B[1;36m" + "Вы пользователь версии \"Expert\"" + "\u001B[0m");
    }

    @Override
    void openDocument() {
        System.out.println("Документ открыт");
    }

    @Override
    void editDocument() {
        System.out.println("Документ открыт");
    }

    @Override
    void saveDocument() {
        System.out.println("Документ сохранен в новом формате");;
    }
}
