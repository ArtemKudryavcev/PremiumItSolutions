# language: ru
@tag3
Функционал: Выбор фасета

  Структура сценария: Перейти на страницу подкатегории и выбрать фасет
    Дано перейти на главную страницу
    Если в департаменте <департамент> из категории <категория> выбрать <подкатегория>
    И выбрать фасет <фасет>

    Примеры:
      | департамент | категория    | подкатегория  |  фасет             |
      | Автотехника | Автоакустика | Автомагнитолы |  USB автомагнитолы |