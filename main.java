public class main {
    public static void main(String[] args) {
        boolean running = true;
        while (running) {
            PhoneBook.hr();
            System.out.println("Телефонная книга:\n");
            System.out.println("1. Просмотреть записи");
            System.out.println("2. Добавить запись");
            System.out.println("3. Удалить запись");
            System.out.println("4. Редактировать запись");
            System.out.println("5. Выйти");
            System.out.print("\nВыберите действие: ");
            int choice = PhoneBook.scanner.nextInt();
            PhoneBook.scanner.nextLine();
            PhoneBook.clearConsole();

            switch (choice) {
                case 1:
                    PhoneBook.displayItems();
                    break;
                case 2:
                    PhoneBook.addItem();
                    break;
                case 3:
                    PhoneBook.deleteItem();
                    break;
                case 4:
                    PhoneBook.editItem();
                    break;
                case 5:
                    running = false;
                    break;
                default:
                    System.out.println("\nНекорректный выбор! Попробуйте снова.\n");
            }
        }
        System.out.println("\nРабота приложения завершена.\n");
    }
}
