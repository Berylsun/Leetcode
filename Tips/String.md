String 是对象\
String s = "abc"\
s.length() 是方法\
s.equals() 内容 == 是地址\
s.substring(0, i) -> [0, i)  O(n)\
s.indexOf() , s.lastIndexOf()  O(n * m)\
s.startWith()  O(n)\
s.toCharArray()\
S.charAt()\
s.split()\
s.trim() 去前后空格

\s 空格\
. 任意字符\
s.split("\\s+") 按空格分\
s.split("\\.") 按点分

```Character.isDigit()
Character.isLetter()
Character.isLetterOrDigit()
Character.toLowerCases()
Character.toUpperCases()
```

其他类型-> String: String.valueOf(Object);\
String -> 其他类型: Object.valueOf(String);

StringBuilder 线程不安全；StringBuffer 线程安全\
StringBuffer 很多方法可以带有synchronized关键字

Palindrome:
```int left = 0, right = s.length() - 1;
while(left<=right){
    if(s.charAt(left) != s.charAt(right)){
        return false;
    }
    left++;
    right--;
}
return true;
```

