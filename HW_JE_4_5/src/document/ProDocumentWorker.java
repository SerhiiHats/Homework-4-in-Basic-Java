package document;

public class ProDocumentWorker extends DocumentBase{

    void seeVersion() {
        System.out.println("\u001B[34m" + "Вы пользователь версии \"Pro\"" + "\u001B[0m");
    }

    @Override
    void openDocument() {
        System.out.println("Документ открыт");
    }

    @Override
    void editDocument() {
        System.out.println("Документ отредактирован");
    }

    @Override
    void saveDocument() {
        System.out.println("Документ сохранен в старом формате, сохранение в остальных форматах доступно в версии Эксперт");
    }
}
