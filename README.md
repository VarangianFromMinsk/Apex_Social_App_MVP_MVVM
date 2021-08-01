# Apex_social_media_app_MVP_MVVM
## Оглавление
* Краткое описание
* Подробное описание
* Технологии

## Краткая информация
Проект - комплексное приложение, реализующие функционал чата, ленты постов друзей и рекомендаций, стримингово музыкального плеера, профиля пользователя, мэнеджера пользователей, поиск пользователя по геопозиции, текущая погода, история поиска фильмов, записки на Room, журнал на SQL, елементарный магазин и тд.
Презентация проекта  -- https://www.behance.net/portfolio/editor?project_id=121487617 (пока не обновлено)

## Подробное описание
* все приложение использует MVP / MVVM, Repository (From firebase to MutableLiveData / from Firebase to Room), Singleton (везде по возможности методом "Static field"), use DataBinding (раздел Посты, далее будет расширяться), Motion layout (пока только в Посты - Рекомендации / От Друзей, так же будет во всех частях, где есть анимации разметки), Dagger 2 (пока только в Посты, будет расширяться), вынос жизненного цикла активити в отдельный класс в котором обновляется "Пользователь онлайн / оффлайн";
* все данные пользователя находятся в Friebase storage / Realtime DB;
* Чат (сообщения, загрузка / репост фото, репост постов, удаление / изменение сообщений, уведомления о новом сообщении (когда вы не в чате с этим пользователем) / пользователь начал вам писать);
* Посты (создание / редактирование,писать комментарии и возможность лайкать, как в инсте с анимацией, переход и просмотр профиля пользователя);
* Музыка (загрузка своей музыки, прослушивание, уведомление с управлением в шторке уведомлений, генерируемый фон плеера из изображения альбома);
* Менеджер Пользователей (блок пользователей, добавления в друзья, показ последнего сообщения и онлайн или оффлайн);
* Профиль пользователя ( изменение аватара и фона, смена пароля, выйти из аккаунта, посмотреть свои посты и понравившуюся музыку, посмотреть местоположения пользователя на карте);
* Окно регистрации и логина с дальнейшем обновлением токена;
* Поиск текущего / выбранного / ближайшего пользователя;
* Уведомление о текущей погоде по городу с возможностью менять город (последний поиск сохраняется в preferences). Реализовано в двух вариантах : через Retrofit 2 / HttpConnection;
* Поиск инфо о фильмах c отображение последнего поиска в dashboard (Volley);
* Заметки на ROOM;
* Журнал тренировок на SQL;
* Добавляемый функционал: загрузка фото из галереи в кастумную активность,выделение нескольких фото и по готовности загрузка на Firebase Storage и RealTime DB, далее по готовности возвращает в начальную активность редактирования поста, и на основе этого возможность создавать посты с несколькими фото в прокрутке, как в инстаграм.

 
## Технологии
Проект создается с помощью:
* Android Studio
* Java
* MVP/MVVM + Repository
* Firebase services
* Google Maps services
* Retrofit 2, Volley, Json, RxJava 2
* ROOM, SQL
* RecyclerView (+SnapHelper / RecyclerView in RecyclerView),  ViewPager, Custom Notification;
* Music Notification (Notification + MediaSession+ PendingIntent + BroadcastReceiver send / get by intentFilter + Service)
* Multithreading (Async task, Thread and etc);
* ContentResolver / ContentProvider;

 
## Использование
* Только не в коммерческих целях
