import app.domain.Customer;
import app.repository.CustomerRepository;

import java.io.IOException;

/*
Этот тестовый класс не является частью проекта.
Этот класс мы используем для тренировки с фреймворком Jackson
и проверки различных методов
 */
public class Test {
//    public static void main(String[] args) {
//        Product product = new Product(7, "Банан", 120, true);
//        System.out.println(product);
//
//        /*
//        mapper - это специальный объект фреймворка Jackson, который
//        умеет преобразовывать Java-объекты в специальный текстовый формат JSON
//        и наоборот - текст формата JSON обратнов Java-объект
//         */
//        ObjectMapper mapper = new ObjectMapper();
//
//        // Настройка маппера для более наглядного формата текста
//        mapper.enable(SerializationFeature.INDENT_OUTPUT);
//
//        // Создаём объект, указывающий на файл, в котором мы хотим записать объект в виде JSON
//        File file = new File("database/product.txt");
//
//        try {
//            mapper.writeValue(file, product);
//
//            // Читаем JSON из файла и преобразовываем обратно в Java-объект
//            Product productFromFile = mapper.readValue(file, Product.class);
//            System.out.println("Прочитанный из файла продукт:");
//            System.out.println(productFromFile);
//
//            // Сохраняем в файл список продуктов
//            List<Product> products = List.of(
//                    new Product(1, "Яблоко", 75, true),
//                    new Product(2, "Виноград", 175, true),
//                    new Product(3, "Апельсин", 105, true)
//                    );
//
//            mapper.writeValue(file, products);
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
//    }

    // Ручная проверка репозитория продуктов


//    public static void main(String[] args) throws IOException {
//        ProductRepository app.repository = new ProductRepository();
//
//        Product product = new Product(3, "Персик", 190, true);
//        app.repository.save(product);
//
//        app.repository.findAll().forEach(System.out::println);
//
//        Product productById = app.repository.findById(1);
//        System.out.println("Найденный продукт");
//        System.out.println(productById);
//
//        Product newProduct = new Product(1, "Яблоко", 80, true);
//        app.repository.update(newProduct);
//
//        app.repository.deleteById(2);
//    }
public static void main(String[] args) throws IOException {
    CustomerRepository repository = new CustomerRepository();
    Customer customer1 = new Customer();
    customer1.setName("Маша");
    customer1.setActive(true);

    Customer customer2 = new Customer();
    customer2.setName("Петя");
    customer2.setActive(true);

    Customer customer3 = new Customer();
    customer3.setName("Вова");
    customer3.setActive(true);

    repository.save(customer1);
    repository.save(customer2);
    repository.save(customer3);




}
}
