# ApiTestingFramework
Тестирование API: RestAssured + Allure + Cucumber

**Запуск тестов через консоль**
 
    mvn clean install -DTAGS="$testN$" allure:report

где testN - тег с названием теста, например test1

**Запуск тестов в дебаге**
 
    запусть дебаг файла src\test\java\Test.java
    предварительно указав нужный тест в tags, например tags = "@test1"

**Запуск тестов через batch файл**
 
    в консоли перейти в папку ApiTestingFramework и прописать:
    run testN
    где testN - тег с названием теста, например test1
    
**Отчеты**
     достаточно открыть файл index.html, лежащий в target\site\allure-maven-plugin в браузере
    
**config.properties** - файл с основными настройками для запуcка автоматизированных тестов
* uri - адрес, к которому будут идти запросы
