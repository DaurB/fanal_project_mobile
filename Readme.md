# Проект по автоматизации тестирования мобильного приложения Wikipedia

<p align="center">
  <img src="media/icons/wiki_logo.jpg" alt="Wiki" width="800">
</p>

##	Содержание

- [Технологии и инструменты](#технологии-и-инструменты)
- [Реализованныe проверки](#реализованные-проверки)
- [Запуск тестов из терминала](#запуск-тестов-из-терминала)
- [Запуск тестов в Jenkins](#запуск-тестов-в-jenkins)
- [Отчет о результатах тестирования в Allure Report](#отчет-о-результатах-тестирования-в-Allure-report)
- [Интеграция с Allure TestOps](#интеграция-с-allure-testops)
- [Интеграция с Jira](#интеграция-с-jira)
- [Уведомления в Telegram с использованием бота](#уведомления-в-telegram-с-использованием-бота)
- [Пример запуска теста в Selenoid](#пример-запуска-теста-в-selenoid)

## Технологии и инструменты

<p  align="center">

<img width="5%" title="IntelliJ IDEA" src="media/icons/Idea.svg">
<img width="5%" title="Java" src="media/icons/Java.svg">
<img width="5%" title="Selenide" src="media/icons/Selenide.svg">
<img width="5%" title="Appium" src="media/icons/Appium.svg">
<img width="5%" title="Browserstack" src="media/icons/Browserstack.svg">
<img width="5%" title="Gradle" src="media/icons/Gradle.svg">
<img width="5%" title="Android Studio" src="media/icons/Android-studio.svg">
<img width="5%" title="Junit5" src="media/icons/Junit5.svg">
<img width="5%" title="GitHub" src="media/icons/GitHub.svg">
<img width="5%" title="Allure Report" src="media/icons/Allure.svg">
<img width="5%" title="Allure TestOps" src="media/icons/Allure_TO.svg">
<img width="5%" title="Jenkins" src="media/icons/Jenkins.svg">
<img width="5%" title="Jira" src="media/icons/Jira.svg">
<img width="5%" title="Telegram" src="media/icons/Telegram.svg">
</p>

## Реализованные проверки

- [x] *Поиск статьи*
- [x] *Открытие статьи*
- [x] *Проверка 4-х страниц на getting started (onBoarding screen)*
- [x] *Добавление языка*

## Запуск тестов из терминала

### Локальный запуск тестов

```bash
gradle clean test
-DtestType=local
```

### Удаленный запуск тестов

```bash
gradle clean test 
-DtestType=browserstack
```

## Запуск тестов в [Jenkins](https://jenkins.autotests.cloud/job/final_project_mobile/)

#### Главная страница Jenkins

<p align="center">
  <img src="media/screen/jenkins_mainpage.PNG" alt="Jenkins" width="800">
</p>

Для запуска сборки необходимо нажать кнопку <code><strong>*Собрать сейчас*</strong></code>.

#### Значок Allure Report

<p align="center">
  <img src="media/screen/jenkins_allure.png" alt="jenkins_allure" width="800">
</p>

Результаты сборки можно посмотреть в Allure отчёте, кликнув на значок <code><strong>*Allure Report*</strong></code>.

## Отчет о результатах тестирования в [Allure Report](https://jenkins.autotests.cloud/job/final_project_mobile/9/allure/)

#### Главная страница Allure Report

<p align="center">
  <img src="media/screen/allure_mainpage.PNG" alt="allure_main" width="800">
</p>

#### Тесты

<p align="center">
  <img src="media/screen/allure_tests.PNG" alt="allure_tests" width="800">
</p>

#### Графики

<p align="center">
  <img src="media/screen/allure_graphs.PNG" alt="allure_graphs" width="800">
</p>

## Интеграция с [Allure TestOps](https://allure.autotests.cloud/launch/18498)

#### Тест-кейсы

<p align="center">
  <img src="media/screen/testops_tests.PNG" alt="testops_tests" width="800">
</p>

#### Дашборды

<p align="center">
  <img src="media/screen/dashboards.PNG" alt="dashboards" width="800">
</p>

## Интеграция с [Jira](https://jira.autotests.cloud/browse/HOMEWORK-505)

#### Задача в Jira

<p align="center">
  <img src="media/screen/jira.PNG" alt="jira" width="800">
</p>

#### Оповещение о результатах сборки

<p align="center">
  <img src="media/screen/telegram.PNG" alt="telegram" width="800">
</p>

## Пример запуска теста в Selenoid

К каждому тесту в отчете прилагается видео.

На данном видео выполняется:

- Проверка открытия статьи

<p align="center">
  <img title="Selenoid Video" src="media/gif/mobile_test.gif">
</p>
9

