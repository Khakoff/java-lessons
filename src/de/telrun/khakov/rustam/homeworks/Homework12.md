## **1 Уровень**
1. Переменная num может принимать значения: 1, 2, 3 или 4. Если она имеет значение 1, то в переменную result запишем "зима", если имеет значение 2 – "весна" и так далее. 
Решите задачу через if-else и через switch-case.
2. Есть два массива char[] first = {‘a’,’b’,’c’,’d’,’e’} и char[] second = {‘f’,’g’,’h’,’i’,’g’} создать массив соединяющий два этих массива в один новый
3. Сгенерировать случайное трехзначное число. Вывести на экран само число, сумму и произведение его цифр.
4. Вводятся длины трех сторон предполагаемого треугольника. Определить, может ли существовать треугольник с такими сторонами при условии что, треугольник существует только тогда, когда ни одна его сторона не превышает сумму двух других.
Например 
10 11 12 существует
10 11 22 не существует - так как 22 больше чем сумма 10 и 11
5. Подсчитать количество слов во введенной пользователем строке. Считаем, что слова разделяются исключительно одним пробелом, а первый и последний символы строки не являются пробелами.
Например в строке "Мама мыла раму" 3 слова
подсказка: Символом разделителя является ' ', можно пройтись с помощью for по строке
6. В таблице символов ASCII под каждый символ выделяется 1 байт памяти. Получается таблица из 256 символов, соответствующих числам от 0 до 255.
Напишите программу, которая выводит на экран символы с 32-го по 126-й включительно. 
При выводе символу должен предшествовать вывод его номера. Вывод выполнить в табличной форме по пять пар (номер:символ) в строке.
Например 33:!
Подсказка: нужно сделать кастование int(или byte) в char чтобы вывести символ по номеру
7. Напишите программу которая сортирует массив в обратном порядке
Например для массива {1,56,34,3,12,78,45,34,23,56,89,56,1,4} после сортировки 
будет [89, 78, 56, 56, 56, 45, 34, 34, 23, 12, 4, 3, 1, 1]
8. Есть массив чисел. Создайте его сами, и наполните сами. Нужно напечатать на консоль:
- значение каждой ячейки массива (пройтись циклом)
- значение каждой ячейки всего массива с конца в начало
- сумму значений всех ячеек
- напечатать кого в массиве больше, четных или нечетных?

##

##**2 Уровень**

1. Дан массив arr[] и целое число  K , где K меньше размера массива, задача состоит в том, чтобы найти K -й наименьший элемент в данном массиве. Дано, что все элементы массива различны. Распечатать индекс и число.
   Подсказка: сначала отсортировать, и после найти элемент с инлексом K

2. Анатолию в последний месяц удача улыбалась очень плохо. У него 3 раза взломали пароль. Вот он и задумался над тем, что неправильно подходит к вопросу составления паролей. Чтобы не напрягаться больше и опять не попасть впросак. Требования к паролю у Анатолия следующие (он внимательно изучил рекомендации знатоков)

- Длина – 8 символов (если меньше – то проще взломать, а если длиннее – то сложно запомнить).

- В пароле должны быть:
  - заглавные буквы,
  - строчные символы,
  - числа
- специальные знаки (из перечня {'*','-','#',';'} другие спецсимволы недопустимы, так как Анатолий их не может запомнить).
  
Помогите парню составить функцию checkPass (pswd), которая проверит пароль на соответствие требованиям.
 
В случае верного пароля выведется на печать «Пароль идеален», а в остальных случаях 
будут перечислены все ошибки, которые Анатолий допустил 
3. Написать программу, которая в зависимости от выбора пользователя вычисляет площадь одной из трех геометрических фигур: прямоугольника, треугольника или круга.

Для вычисления площади прямоугольника вводятся длины двух его сторон, треугольника - трех сторон, круга - вводится диаметр.

Площадь прямоугольника: area = a * b
Площадь треугольника: area = sqrt(s * (s - a) * (s - b) * (s - c)), где s = (a + b + c) / 2. В языке Java функция Math.sprt() извлекает квадратный корень.
Площадь круга: area = pi * sqr(d) / 4. Функция sqr() возводит в квадрат.

Пользователь осуществляет выбор фигуры, площадь которой он хочет получить, 
путем ввода цифр 1, 2 или 3.
- 1 - подсчитывается площадь прямоугольника
- 2 - подсчитывается площадь треугольника
- 3 - подсчитывается площадь круга
