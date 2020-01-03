package kj.x.jd.mode

//1.主构造方法至少要有一个参数，且参数必须标记为val or var
//2.数据类不能用open、abstract、sealed(封闭类)、inner标识
data class DataClass(var userName: String, var age: Int)

var user = DataClass("xdf", 27)
var user1 = user.copy(age = 30)