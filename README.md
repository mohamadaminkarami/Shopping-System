video: https://drive.google.com/file/d/1DpSnF8_p3FFH3KAPwzIYEsHTi8S-MAh6/view?usp=sharing

<div dir="rtl">

# Shopping-System

می‌خواهیم سیستمی طراحی کنیم که بتوان در آن در ازای پرداخت مبلغی کالایی خرید(کالا توسط سیستم تامین می‌شود) یا خدمتی گرفت(مثل نظافت منزل و... که توسط مشتری‌ها انجام می‌شود و در ازای خدمت مبلغی دریافت می‌کنند.)

توضیحات بیشتر:
هر حساب یک یوزرنیم و پسورد و زمان ساخته شدن دارد.
هر ادمین یک نفش دارد (ceo, manager, accountant, simple)

هر محصول یک اسم و قیمت و توضیحات و تعداد موجود در انبار و یک آیدی منحصر به فرد دارد
هر خدمت یک اسم و قیمت و شخص ارائه دهنده و یک آیدی منحصر به فرد دارد.

## views

#### Welcome

این صفحه وظیفه ثبت‌‌نام، ورود یا خروج از برنامه را به عهده دارد.

#### Main

برای ادمین:
۱. نمایش کالاها و خدمات
۲. اضافه کردن کالاها
۳. تغییر مشخصات یک کالا
۴. رفتن به صفحه پروفایل

برای مشتری:
۱. نمایش کالاها و خدمات
۲. خرید کالا یا خدمت
۳. اضافه کردن خدمت
۴. اضافه کردن کامنت
۵. رفتن به صفحه پروفایل

#### Profile

۱. افزایش موجودی
۲. تغییر مشخصات
۳. دیدن پیام ها یا ارسال پیام
۴. دیدن تمام یوزر ها(برای ادمین)
۴. افزایش موجودی(برای مشتری)
۵. خروج

</div>

# Concepts

### 4 fundamental OOP concepts:

##### Encapsulation:

https://www.tutorialspoint.com/java/java_encapsulation.htm

###### immutable objects

https://www.geeksforgeeks.org/create-immutable-class-java/

##### Inheritance:

https://www.tutorialspoint.com/java/java_inheritance.htm

##### Abstraction:

https://www.tutorialspoint.com/java/java_abstraction.htm

example: car, coffee maker, ...

##### Polymorphism:

https://www.tutorialspoint.com/java/java_polymorphism.htm

### Singleton vs Static class

https://stackoverflow.com/questions/519520/difference-between-static-class-and-singleton-pattern

https://www.geeksforgeeks.org/difference-between-singleton-pattern-and-static-class-in-java/

### abstract vs interfaces

https://www.javatpoint.com/difference-between-abstract-class-and-interface

### Questions

<div dir="rtl">
در رابطه با sort هایی که از اورراید compareTo و ... استفاده باید بشه اگه توضیح بدید ممنون میشم
چون چند جایی رو خوندم چیزهایی مختلفی نوشته بود و خیلی مفهوم نبود

یه سوالی که من دارم اینه که وقتی منو ها رو توی قسمت view می ذاریم، تفکیک دو قسمت view و controller خیلی سخته. همه چیزایی که توی منو لازمه توی کلاسش هست یعنی در قسمت view. دیگه چیزی نیست که بذارم توی قسمت controller 😕
ممنون میشم در این باره توضیح بفرمایید

من یه سوالی برام پیش اومد تو این ویدیو های آخر پروژه شطرنج تو معماری mvc اینجوری گفتین که model فقط مربوط به موجودیت ها و ویژگی هاشون میشه و اعمالی که منطق مربوط به اون هاست توی controller پیاده میشه (من اینطور برداشت کردم) ولی توی اون پروژه شطرنج حرکت دادن مهره ها و بررسی امکان حرکت دادن اونها توی model بودن ولی به نظرم اینا مربوط به منطق مربوط به اونها میشه.
یا مثلن توی همین تمرین حرکت دادن شکلات یا از بین رفتن شکلات توی model باید باشن یا controller.

ممنون

یه سوالی که دارم این بود که مگه همه امور مربوط به نمایش دادن مگه نباید تو view باشه؟
الان اون پروژه شطرنجی که زدید اگه بخوایم گرافیکیش کنیم باید مدل رو هم تغییر بدیم که

یه سوال دیگه اینکه توی کارگاه اول کنترلر رو یه instance ازش ساختن ولی توی شطرنج متدها رو استاتیک گذاشتید و خب نیازی به instance ساختن نبود
جفتشون درستن؟

Interface چیه؟
تو کارگاه‌های قبلی گفتید؟
تو کدنامه نوشته‌بود

</div>
