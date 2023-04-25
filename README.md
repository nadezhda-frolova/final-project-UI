# Дипломный проект по тестированию UI сайта [https://kazan.hh.ru/](https://kazan.hh.ru)

<p align="center">
  <img src="media/logo/HeadHunter_logo.png" alt="HeadHunter" width="200">
</p>

## :open_book: Содержание:

- [Технологии и инструменты](#technologist-технологии-и-инструменты)
- [Тест кейсы](#bookmark_tabs-тест-кейсы)
- [Запуск тестов из терминала](#computer-запуск-тестов-из-терминала)
- [Запуск тестов в Jenkins](#-запуск-тестов-в-jenkins)
- [Отчет о результатах тестирования в Allure Report](#-отчет-о-результатах-тестирования-в-Allure-report)
- [Интеграция с Allure TestOps](#-интеграция-с-allure-testops)
- [Уведомления в Telegram](#-уведомления-в-telegram)


## :gear: Технологии и инструменты

<p align="left">
<a href="https://www.jetbrains.com/idea/"><img src="media/logo/Intelij_IDEA.svg" width="50" height="50"  alt="IDEA" title="IntelliJ IDEA"/></a>
<a href="https://www.java.com/"><img src="media/logo/Java.svg" width="50" height="50" alt="Java" title="Java"/></a>
<a href="https://gradle.org/"><img src="media/logo/Gradle.svg" width="50" height="50" alt="Gradle" title="Gradle"/></a>
<a href="https://junit.org/junit5/"><img src="media/logo/JUnit5.svg" width="50" height="50" alt="JUnit 5" title="JUnit 5"/></a>
<a href="https://github.com/"><img src="media/logo/GitHub.svg" width="50" height="50" alt="Github" title="GitHub"/></a>
<a href="https://github.com/allure-framework/allure2"><img src="media/logo/Allure_Report.svg" width="50" height="50" alt="Allure" title="Allure"/></a>
<a href="https://qameta.io/"><img src="media/logo/Allure_TO.svg" width="50" height="50" alt="Allure_TO" title="Allure_TO"></a>
<a href="https://www.jenkins.io/"><img src="media/logo/Jenkins.svg" width="50" height="50" alt="Jenkins" title="Jenkins"/></a>
<a href="https://web.telegram.org/"><img src="media/logo/Telegram.svg" width="50" height="50" alt="Telegram" title="Telegram"></a>
</p>

## :heavy_check_mark: Тест кейсы

- Проверка перехода с главной страницы на страницу вакансий при нажатии на кнопку "Найти"
- Проверка перехода с главной страницы на страницу с вакансией, указанной в поисковой строке
- Проверка перехода с главной страницы на страницу с регистрацией соискателя
- Проверка наличия кнопки 'Войти' на главной странице сайта
- Проверка перехода с главной страницы на страницу консультации экспертов
- Проверка наличия футера на странице с вакансией

## :computer: Запуск тестов из терминала

### Удаленный запуск тестов

```bash
gradle clean test -Denv=remote
```

### Локальный запуск тестов

```bash
gradle clean test -Denv=local
```

## <img width="4%" title="Jenkins" src="media/logo/Jenkins.svg"> Запуск тестов в [Jenkins](https://jenkins.autotests.cloud/)

Для запуска сборки необходимо нажать кнопку <code><strong>*Собрать сейчас*</strong></code>.

<p align="center">
  <img src="media/screen/start_jenkins1.png" alt="Jenkins" width="800">  
</p>

После выполнения сборки, в блоке <code><strong>*История сборок*</strong></code> напротив номера сборки появится
значок *Allure Report* и *Allure TestOps* кликнув по которому, откроется страница со сформированным html-отчетом и тестовой документацией.

## <img width="4%" title="Allure Report" src="media/logo/Allure_Report.svg"> Отчет о результатах тестирования в [Allure Report](https://jenkins.autotests.cloud/job/nadezhda-frolova.lesson14_readme/allure/)


<p align="center">
  <img src="media/screen/jenkins_overview2.png" alt="allure-report" width="900">
</p>

### Список тестов с результатами прогона

<p align="center">
  <img src="media/screen/jenkins_behaviors2.png" alt="allure-report_1" width="900">
</p>

## <img width="4%" title="Allure TestOPS" src="media/logo/Allure_TO.svg"> Интеграция с [Allure TestOps](https://allure.autotests.cloud/project/2166/)

### Страница с пройденным прогоном

<p align="center">
  <img src="media/screen/dashboard1.png" alt="dashboard" width="900">
</p>

### Список тестов с результатами прогона

<p align="center">
  <img src="media/screen/testcaseslist1.png" alt="dashboard" width="900">
</p>

## <img width="4%" title="Telegram" src="media/logo/Telegram.svg"> Уведомления в Telegram
После завершения сборки специальный бот, созданный в <code>Telegram</code>, автоматически обрабатывает и отправляет сообщение с отчетом о прогоне тестов.

<p align="center">
<img title="Telegram Notifications" src="media/screen/Telegram1.png">


К каждому тесту в отчете прилагается видео.

На данном видео выполняется:


- Проверка перехода с главной страницы на страницу вакансий QA

<p align="center">
  <img title="Selenoid Video" src="media/video/results.gif">
</p>
