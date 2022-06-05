package document;

public class DocumentWorker extends DocumentBase {


    @Override
    public void seeVersion() {
        System.out.println("Вы пользователь версии для начинающих (бесплатная версия)");
    }


    @Override
    void openDocument() {
        System.out.println("Документ открыт");
    }

    @Override
    void editDocument() {
        System.out.println("Редактирование документа доступно в версии Про");
    }

    @Override
    void saveDocument() {
        System.out.println("Сохранение документа доступно в версии Про");
    }
}
