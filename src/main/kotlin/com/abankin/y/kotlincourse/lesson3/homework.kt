package com.abankin.y.kotlincourse.lesson3

//Погрузимся в атмосферу "Hackathon Survival": Марафон, где участники пытаются завершить реальный проект в условиях искусственно созданного хаоса (например, часто меняющиеся требования, неожиданные "сбои" в оборудовании)
//Для каждого из полей подбери наилучший способ хранения из известных тебе. Учитывай такие факторы, как изменяемость, обязательность, возможность начальной установки, ресурсоёмкие вычисления значения, необходимость проверки устанавливаемого значения на валидность или запрет доступа на установку при возможности чтения, публичность и приватность данных.
//Название мероприятия
const val eventName: String = "Event Name"
//Дата проведения
var eventDate: String = "2024-09-12 10:00"
//Место проведения
var eventLocation: String = "Earth"
//Подробный бюджет мероприятия, включая расходы на оборудование, кейтеринг и другие операционные расходы.
var budget: String = "budget.xlsx"
//Количество участников
var participants: Int = 123
//План эвакуации
val evacuationMap: String = "map.png"
//Список доступного оборудования
var equipment =  listOf("PC","Notebook","Tablet","Smartphone")
//Список свободного оборудования
var freeEquipment = listOf("PC_free","Notebook_free","Tablet_free","Smartphone_free")
//График питания участников (зависит от поставщика питания, определяемого за неделю до начала)
lateinit var foodPlan: String
//План мероприятий на случай сбоев
var emergencyPlan: String = "emergency_plan.docx"
//Список экспертов и жюри
var experts = listOf("Exp1","Exp2","Exp3")
//Методы и процедуры для сбора отзывов от участников и гостей, включая анонимные опросы и интервью.
var feedbackMethods = listOf("Method_1","Method 2")
//Политика конфиденциальности
val privatePolicy: String = "Text of policy"
//Приватные отзывы (фидбэк) участников и зрителей для анализа проблем.
private lateinit var private_feedback: String = "private_feedback.docx"
//Текущая температура в помещении
val maxtemp: Double = 25.0
//Мониторинг и анализ производительности сетевого оборудования и интернет-соединения.
val networkPerformance: String = "Мониториниг сети"
//Уровень освещения
var lightLevel: Float = 50.6f
//Лог событий мероприятия
var eventLog: String = "eventlog.log"
//Доступность медицинской помощи
var medicSupport: Boolean = true
//Планы и процедуры для обеспечения безопасности мероприятия, включая планы эвакуации и протоколы чрезвычайных ситуаций.
var securityPlans = listOf("План безопасности","План эвакуации","Протокол ЧС")
//Регистрационный номер мероприятия
val regID: Int = 1
//Максимально допустимый уровень шума в помещении хакатона.
const val maxNoise: Float = 66.0f
//Индикатор превышения уровня шума в помещениях
lateinit var maxNoiseAlarm: Boolean
//Формат мероприятия (зависит от геополитической обстановки)
lateinit var eventFormat: String
//Количество свободных мест для отдыха (например, кресел или диванов), сеттер валидирует, чтобы количество не было меньше нуля.
var restSeats: Int  = 0 // Количество свободных мест для отдыха
    set(value){
        field = if (value > 0 ) value else 0
    }
//План взаимодействия с прессой
var pressPlan: String = "План взаимодействия с прессой"
//Детальная информация о проектах каждой команды, сбор данных включает в себя компиляцию кода и сбор статистики прогона автоматизированных проверок.
var detailedTeamsReport = listOf("team1","team2","team3")
//Статус получения всех необходимых разрешений
lateinit var permissons: Boolean
//Указывает, открыт ли доступ к эксклюзивным ресурсам (например, специальному оборудованию)
var excluviseResources: Boolean = true
//Список партнеров мероприятия
const val sponsors = listOf("Spomsor1","Sponsor2","Sponsor3")
//Отчет, включающий фотографии, видео и отзывы, генерируется и становится доступен после завершения мероприятия.
lateinit var report: String
//План распределения призов
var prizes: String = "prizes.xlsx"
//Контактная информация экстренных служб, медицинского персонала и других важных служб, недоступная участникам.
private val contacts: String = "Контактная информация"
//Особые условия для участников с ограниченными возможностями
var specific_conditions: String = "Особые условия для участников с ограниченными возможностями"
//Общее настроение участников (определяется опросами)
lateinit var mood_participants: String
//Подробный план хакатона, включающий время и содержание каждого сегмента, инициализируется непосредственно перед началом мероприятия.
var hackathon_plan = listOf("10:00 Начало","15:00 Середина", "18:00 Конец")
//Имя знаменитого специального гостя, которое будет объявлено за день до мероприятия.
lateinit var specialguest: String
//Максимальное количество людей, которое может вместить место проведения.
const val max_participants: Int = 132
//Стандартное количество часов, отведенное каждой команде для работы над проектом.
val worktime: Int = 5
//Текущая температура в помещении
var temperature: Double = 24.4
