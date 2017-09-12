# ApiTestingFramework
Тестирование API: RestAssured + Allure + Cucumber

**Запуск тестов через консоль**
 
    mvn clean install -DTAGS="tag" allure:report

где tag - тег, указываюший на конкретный тест или набор тестов, например, test1

**Запуск тестов в дебаге**
 
запустить дебаг файла src\test\java\Test.java
предварительно указав нужный тег в tags, например, tags = "@test1"

**Запуск тестов через batch файл**
 
в консоли перейти в папку ApiTestingFramework и прописать:

    run tag

где tag - тег, указываюший на конкретный тест или набор тестов, например, test1
    
**Отчеты**

достаточно открыть файл index.html, лежащий в target\site\allure-maven-plugin в браузере
    
**config.properties** - файл с основными настройками для запуска автоматизированных тестов
* uri - адрес, к которому будут идти запросы