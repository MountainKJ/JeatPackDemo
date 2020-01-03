package kj.x.jd.mode

open class User {
    var age: Int? = 0
    open fun banana(){

    }
    //嵌套类(内部类)
    inner class UserName {

    }
}

interface  UserImpl{
    fun getName(): String       //无默认方法体，必须重写
    fun getAge(): Int{          //有默认方法体，可以不重写
        return 22
    }
}

class UserImpll: UserImpl {
    override fun getName(): String {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getAge(): Int {
        return super.getAge()
    }
}
//使用内部类
var userName: User.UserName = User().UserName()

class Fruits : User(){
    override fun banana() {
        super.banana()
    }
}