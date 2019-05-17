/*
多行注释
public:公共的
class:java最基本的代码组成原件  类
高亮显示的单词表示的是java中关键字
这些单词是jdk自带的一些具有特殊功能的英文单词
*/
public class Test{//这里是类名 必须和文件名保持一致
//单行注释,每次遇到{第二行代码必须缩进一个Tab键
	public static void main(String[] args){
		//固定不变的，main就是代码的入口
		//输出一句话
		System.out.println("hello world");//System.out.println jdk提供的输出
		System.out.println(32);
		System.out.println('a');//字符,里面只能放一个
		System.out.println('b');
		//系统向外输出打印一些内容，并且换行
		//()里面放的就是需要输出的内容 ;表示一句代码的终结
		// 12 整数  12.5浮点  ""表示的是字符串数据类型
	}
}