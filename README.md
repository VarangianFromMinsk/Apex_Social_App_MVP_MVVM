# Apex_social_media_app_MVP_MVVM
## Оглавление
* Краткое описание
* Подробное описание
* Технологии

## Краткая информация
Проект - комплексное приложение, реализующие функционал чата, ленты постов друзей и рекомендаций, стримингово музыкального плеера, профиля пользователя, мэнеджера пользователей, поиск пользователя по геопозиции, текущая погода, история поиска фильмов, записки на Room, журнал на SQL, елементарный магазин и тд.
Презентация проекта  -- https://www.behance.net/portfolio/editor?project_id=121487617 

## Подробное описание
* все приложение использует MVP / MVVM + Repository;
* все данные пользователя находятся в Friebase storage / Realtime DB;
* Чат (сообщения, загрузка / репост фото, репост постов, удаление / изменение сообщений, уведомления о новом сообщении / пользователь начал вам писать);
* Посты (создание / редактирование, комментарии и возможность лайкать, как в инсте с анимацией);
* Музыка (загрузка своей музыки, прослушивание, уведомление с управлением в шторке уведомлений, генерируемый фон плеера из изображения альбома);
* Менеджер Пользователей (блок пользователей, добавления в друзья, показ последнего сообщения и онлайн или оффлайн)
* Профиль пользователя ( изменение аватара и фона, смена пароля, выйти из аккаунта, посмотреть свои посты и понравившуюся музыку, посмотреть местоположения пользователя на карте);
* Окно регистрации и логина с дальнейшем обновлением токена;
* Поиск текущего / выбранного / ближайшего пользователя;
* Уведомление о текущей погоде по городу с возможностью менять город (последний поиск сохраняется в preferences). Реализовано в двух вариантах : через Retrofit 2 / HttpConnection;
* Поиск инфо о фильмах c отображение последнего поиска в dashboard (Volley);
* Заметки на ROOM;
* Журнал тренировок на SQL;
* Добавляемый функционал: загрузка фото из галереи в кастумную активность,выделение нескольких фото и по готовности загрузка на Firebase Storage и RealTime DB,по готовности возвращает в начальную активность редактирования поста, и на основе этого возможность создавать посты с несколькими фото в прокрутке, как в инстаграм.

 
## Технологии
Проект создается с помощью:
* Android Studio
* Java
* MVP/MVVM
* Firebase services
* Google Maps services
* Retrofit, Volley, Json, RxJava
* ROOM, SQL
* Async task, Handler ,Thread
* ContentResolver / ContentProvider, BroadcastReceiver;

 
## Использование
* Только не в коммерческих целях
