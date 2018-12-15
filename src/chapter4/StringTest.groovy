package chapter4

//def singleName = 'a single string'
//println singleName.class
//
//def thupleName = '''line one
//line two
//line three'''
//println thupleName
//
//def doubleName = "this a common String"
//println doubleName.class

//def name = 'Android'
//def sayHello = "Hello : ${name}"
//println sayHello
//println sayHello.class


//def sum = "The sum of 2 and 3 equals ${2 + 3}"
//println sum

// ===============================字符串方法============================

def str = 'groovy'
def str2 = 'Hello'
def str3 = 'oo'

// 1、字符串填充
// center方法
/*println str.center(8, 'a')
// padLeft
println str.padLeft(8, 'b')
// padRight
println str.padRight(8, 'c')*/

// 2、字符串比较

/*
// 通过compareTo方法比较
println str.compareTo(str2)
// 通过操作符比较
println str > str2*/

// 3、索引，获取字符串中的某一个字符

/*// getAt方法
println str.getAt(0)
// []获取
println str[0]
println str[0..1]*/

// 4、减法，将参数中的值从原有字符串中去除
/*println str.minus(str2)
println str.minus(str3)*/

// 5、反转
println str.reverse()

// 6、首字母大写
println str.capitalize()


