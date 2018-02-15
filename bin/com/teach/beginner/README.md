# MJK

<div id="0"> Beginner </div>

********

用途: 給初學者

備註: 先前版本可上<a href="https://github.com/timeisrun/Java_projects/tree/master/teach" >這</a>觀看

********

#[0. 教學大綱](#0)

##Course0

- [jre](#jre), [jdk](#jdk), [new project class](#new-project-class), [package](#package), [public static void](#public-static-void), [import](#import),

- [輸出](#輸出), [整數](#宣告整數), [小數](#宣告小數), [字串](#宣告字串), [字元](#declare-char), [輸入](#input), [if else](#if-else), [for](#for-loop), [switch](#switch), [三元運算子](#three),

- [轉型](#change-type)

##Course1

- [陣列](#陣列), [length](#length), [new](#new), [null](#null), [函數](#函數), [return](#return), [static variable](#static-variable)

##Course2

- [class](#class), [static](#static), [public, protected, private](#ppp), [繼承](#inherit), [範例](#example)

##Course3

- [screenwidth](#screenwidth), [JFrame](#jframe), [JPanel](#jpanel), [JButton, Font](#jbutton-font), [JLabel](#jlabel), [TextArea](#textarea), [TextField](#textfield), [two of action](#two-of-action), [Mouse Listener](#mouse-listener)

##Course4

- [timer](#timer)

##Course5

- [write](#write), [read](#read)

********

#[1. Course0.java](#0)

<div id="jre">##jre<p></div>

    JAVA運行環境(JAVA running environment), 這是JAVA通行各種OS(作業系統)的基礎

<div id="jdk">##jdk<p><div>

	JAVA開發套件(JAVA development kit), 一般使用者不需, 但程式開發者需要此物來協助compile和debug
	
以上是最基礎要知道的名詞意義<p>

至於JAVAHOME變數我沒在用就自行google<p>

<div id="new-project-class">##new project class<p></div>
首先我們要先開啟新專案, 才能在裡面coding然後送給編譯器編譯<p>
請先啟動你的eclipse<p>

    File -> new -> Java projects -> 填寫專案名稱 -> finish

接著在你的專案瀏覽器(或稱工作區)對著剛剛新增的java project點右鍵<p>

    new -> class -> 給你的主檔案取個名字 -> 下方public static void main(String[] args)勾選 -> finish

剛剛新增的Java project表示說我們要做一個專案, 這個專案的名字叫做XXX<p>
新增完後eclipse會幫你建好檔案內容, 比如說裝著原始碼的src資料夾, 裝編譯完後.class檔存放的bin資料夾等等<p>
接著對project按右鍵新增class檔, 就是增加一個檔案可以寫你的原始碼(還有很多東西可以新增到你想指定的地方)<p>

<div id="package">##package<p></div>
也許會有一行package在你剛new的class內容最上方, package是讓編譯器分辨該檔案應是和那些群組連結在一起的, class在Course2會介紹<p>
主要用處是在修飾子相關的時候, 使用權限的差異, 以及開發大型程式時的規範和辨認需要<p>

<div id="public-static-void">##public static void<p></div>
剛剛在new class時, 勾選的選項意義是, 給你的這個java檔加上那一段function(可以自行試試看new class不勾選會變什麼樣子)<p>
而這段function的意義是, 你可以將有這段main function的java檔, 當作此project的進入點, 從這邊開始運行程式<p>

其中<p>
* public為公開之意, 其他任何檔案皆可呼叫此檔案的public function<p>
* static只要程式運行, 則此修飾子修飾的成員就會率先配置記憶體, 程式結束此物才跟著消滅, (function, 變數等等成員都可用此修飾子)<p>
* void為不回傳, 表示此function不回傳值<p>

<div id="import">##import<p></div>
再來是import, 跟C一樣將其他人寫好的函式庫匯入進來, 等等會用到<p>

> ## Tips
> Ctrl + 斜線可整行(整段)註解或反註解<p>
> 在eclipse中 Ctrl + F11 可編譯並執行

<div id="輸出">##輸出<p></div>

打開Course0.java檔, 觀看裡面程式碼<p>

學一個程式語言, 慣例是讓你印出Hello world, 所以先學習輸出內容到monitor上

    System.out.println("And this type will change line.");

println的意思是印出+換行<p>

用print則只有印出<p>

而且輸出可吃反斜線n

    System.out.println("Hello, my name is\nWayne.");
    
<div id="宣告整數">##宣告整數<p></div>

    int varInt = 9999;

並可將變數varInt放至輸出中印出<p>

    System.out.println(varInt);
    
<div id="">##四則運算<p></div>

也可在輸出中做運算

    int varA = 10, varB = 2;
    System.out.println("加法: " + (varA + varB));

<div id="宣告小數">##宣告小數<p></div>

    Double varDouble = 123.456;
    
<div id="宣告字串">##宣告字串<p></div>

    String varString = "小明";
    
<div id="string-plus">##字串中的相加<p></div>

    System.out.println("你好" + varString + ", 初次見面");

也可以使用C的printf

    System.out.printf("你好%s, 初次見面\n", varString);
    
<div id="declare-char">##宣告字元<p></div>

    char varChar = 'a';
    
<div id="input">##輸入, try/catch, throw IOException<p></div>

輸入有scanner, 如下<p>

	Scanner scn = new Scanner(System.in);
	int num = scn.nextInt();
	String str = scn.nextLine();
	
	while(scn.hasNext()) System.out.println(scn.nextLine());

<div id="if-else">##if else選擇敘述</div>

    int varSelect = 5;
	if (varSelect == 5) {
		System.out.println("varSelect is 5");
	} else if (varSelect > 10) {
		System.out.println("varSelect bigger then 10");
	} else {
		System.out.println("varSelect is: " + varSelect);
	}
    
基礎知識, 僅介紹格式, 不再贅述<p>
當然Java在只有一行指令時, 也可以省略大括號<p>

    if (varSelect == 5)
		System.out.println("varSelect is 5");
	else if (varSelect > 10)
		System.out.println("varSelect bigger then 10");
	else
		System.out.println("varSelect is: " + varSelect);
    
<div id="for-loop">##for迴圈</div>

    for (int i = 0; i < 10; i++) {
		System.out.println("For Loop: " + i);
	}
	
	int varWhile = 5;
	while (varWhile > 0) {
		System.out.println("While Loop: " + varWhile);
		varWhile--;
	}

也是基礎知識, 不再贅述<p>

<div id="switch">##switch選擇敘述</div>

    int varSwitch = 1;
	switch (varSwitch) {
	case 1:
		System.out.println("值是1");
		break;
	case 2:
	case 3:
		System.out.println("值是3");
	case 4:
		System.out.println("我忘記加break了QQ");
		break;
	case 5:
		System.out.println("值是5, 後面沒break沒差");
	}
    
這邊注意的是break必須在每個case的最後使用, 否則會執行到switch結尾或遇到break才離開<p>

<div id="three">##三元運算子</div>

    int varThree = 1;
	varThree = (varThree == 1) ? 2 : 3;
	System.out.println(varThree);
    
雖然是基礎知識還是解釋一下<p>
格式意義為 (邏輯敘述) ? 前者為真 : 前者為假;<p>
所以上方例子, 程式會印出2<p>

<div id="change-type">##轉型</div>

    String varChange = "123";
    int varAfterChange = Integer.parseInt(varChange);

其他還有各種互相轉換方式, google上都有人列出來<p>


> ##practice:
> 1. 輸入一個數字, 算出1~輸入數字的總和,<p>
> 如果大於1000, 輸出"數字太大了~", 小於1000則輸出"總和是XXX!!",<p>
> 如果輸入的不是數字, 則輸出"ERROR"(不用考慮輸入負數和小數的情況)

********

#[2. Course1.java](#0)

<div id="陣列">##陣列</div>

	int[] arrayInt1 = new int[12];
	int[] arrayInt2 = { 3, 4, 5 };
	
介紹陣列寫法, 與C語言相似<p>
可以用第一種宣告陣列大小的方式, 宣告陣列, 如果沒設定初始值則JAVA會自動全部歸0<p>
第二種為宣告陣列內容的方式, 大小為3<p>

<div id="length">##length</div>

	for(int i=0; i<arrayInt1.length; i++) System.out.println(arrayInt1[i]);
	
arrayInt1.length可以取得arrayInt1陣列的大小<p>

<div id="new">##new</div>

再來說說宣告變數時用到的""new""這個詞<p>
當一個成員(或變數)宣告完並且使用完後, 如果再被new一次<p>
他會變成一個全新的成員(或變數)<p>
而舊的成員(或變數)過一段時間後會被JAVA垃圾回收機制回收, 歸還記憶體<p>	

	int[] arrayInt1 = new int[12];
	arrayInt1[0] = 5;
	System.out.println(arrayInt1[0]);
	arrayInt1 = new int[12];
	System.out.println(arrayInt1[0]);
	
如上範例會印出5下一行印出0

<div id="null">##null</div>

再來說說null的概念<p>
他表示這個成員(或變數)內的東西不存在或未賦值或未指向任何記憶體位址<p>
有時可以藉此判斷有沒有獲得值來寫判斷式<p>
首先我們先宣告兩個陣列<p>

	Double[] arrayDouble = new Double[12];
	String[] arrayString = new String[12];

因為只有int陣列宣告JAVA會幫你自動歸0<p>
所以

	System.out.println(arrayDouble[0]);
	System.out.println(arrayString[0]);
	
會印出兩個null

<div id="函數">##函數</div>

你的main就是一個函數(function)<p>
比如在和main同階層的地方新增一個function<p>

	public static void theFunctionOfPrint(String str) {
		System.out.println(str);
	}
	
	
public static void在Course0解釋過了<p>
表示此function可以被其他java檔呼叫, 表示此程式片段隨著程式執行而生成而消滅, 表示此function不需回傳值<p>
括號裡頭的string str表示此function從別的地方呼叫, 必須傳入字串型態的變數, (在此function中此傳入變數的名稱為str, 型態為string)<p>
否則系統會報錯<p>
可以在main中呼叫此function<p>

	print("天氣很好");
	
則程式會將""天氣""這個字串傳進去theFunctionOfPrint<p>
並照著程式執行下去, 印出一行字<p>
同樣的也可以先宣告變數, 再傳進function<p>

	String varWeather = "天氣很不好";
	theFunctionOfPrint(varWeather);
	
但注意到了嗎?<p>
我們宣告的變數str型態是string<p>
所以才可以傳進去theFunctionOfPrint<p>
因為你在theFunctionOfPrint那邊已經宣告了會傳入型態為string的變數str進來<p>
所以如下程式編譯器會報錯<p>

	int varInt = 122;
	theFunctionOfPrint(varInt);
	
因為你的varInt是int型態不是string型態<p>

<div id="return">##return</div>

既然了解了function的寫法及意義, 再來介紹return功能<p>

return顧名思義就是回傳值<p>
所以function要這樣宣告<p>

	public static int add(int A, int B) {
		int C = A + B;
		return C;
	}
	
function的修飾子從剛剛的void變成int了<p>
表示這個function執行完會回傳一個int回去呼叫的地方<p>
在上方例子中也就是回傳A+B的結果回去呼叫的地方<p>
所以可以在main中這樣呼叫<p>

	int varA = 10, varB = 17;
	int varC = add(varA, varB);
	System.out.println(varC);
	
則執行程式會印出10+17的結果27<p>
當然, 也可以直接將呼叫function的程式碼放在println裡面<p>

	System.out.println(add(varA, varB));
	
<div id="static-variable">##static variable</div>

最後, 來說明static variable<p>
在Course1.java檔中, 在main function的上方, 有宣告一個變數<p>

	static int varGlobal = 0;
	
static表示此變數隨著程式執行結束而生成消滅<p>
故可將這當作c中全域變數的概念<p>
我們先寫一個function<p>

	public static void AddtoGlobalVar(int A) {
		varGlobal += A;
	}
	
呼叫此function會將你傳入function的值加到varGlobal這個變數之中<p>
所以在main function寫出如下程式<p>

	int unit = 10;
	System.out.println(varGlobal);
	AddtoGlobalVar(unit);
	System.out.println(varGlobal);
	AddtoGlobalVar(unit);
	System.out.println(varGlobal);
	
雖然在main沒有運算到varGlobal這個變數<p>
但因為他是全域變數<p>
所以可以在AddtoGlobalVar中運算<p>

> ##practice:
> 1. 寫一個function, 傳遞50進去, 可以回傳1加到50的結果回來
> 2. 寫一個function, 不使用return, 傳遞50進去後可以在main主程式印出1加到50的結果

********

#[3. Course2.java](#0)

<div id="class">##class</div>

class是一種類別, 比如你的專案主程式main是寫在class裡面, 你要以.java檔定義成員也是寫在class裡面<p>
for example, 今天new一個class, 程式定義好了該class中需要宣告的成員, 可能是各種變數, 各種function等等<p>
想觀看除了運算子(operator)的定義, 只需要用滑鼠雙擊想觀看的部分(像是println), 右鍵, 選擇開啟宣告即可追溯定義檔(.class)<p>

	System.out.println("Hello world!");
	
開啟println宣告

	public void println(char x[]) {
        synchronized (this) {
            print(x);
            newLine();
        }
    }
	
可發現println是由印出(print function) + 換行(newLine function)組成
開啟print宣告

	public void print(char s[]) {
        write(s);
    }
	
開啟write宣告

	private void write(char buf[]) {
		//...很長   
	}
	
好像扯遠了, 回來講class<p>
我們現在來練習定義一個class<p>
請看User.java檔是寫好的定義檔, 裡面宣告了5個變數和2個function<p>

	static public String planet = "earth";
	public String name = "小明";
	public int weight = 60;
	protected int height = 173;
	private int age = 20;
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int a) {
		age = a;
	}

你可以看到我用了4個修飾子static, public, protected, private<p>

<div id="static">##static</div>
static可和後面三個修飾子互相搭配, 用作靜態宣告(隨著程式運行而生成, 結束而消滅)<p>
如main主程式一定要static宣告, 因為他是最開始執行的class, 不以static宣告的話則JVM必須先new一個main的function才能運行<p>
可是JVM又找不到地方知道他要new一個main, 因為找不到main程式進入點<p>
找不到進入點不知道要new, 不知道要new就不能運行, 所以要宣告成static, 則JVM可以直接調用main function<p>
又比如宣告static int 變數, 則我在main裡頭不需要new一次這個變數, JVM在程式剛開始運行就已經幫我建好了, 可以直接調用<p>
但如此就會發生一個小問題, 如果濫用static修飾子, 會對電腦造成額外負擔<p>
因為這些變數要在剛開始運行時就要劃記憶體位置給他們, 而且程式結束前不能回收<p>
但值得慶幸的是, 目前處理器的速度和記憶體的容量已經進步到不需要特別考慮這些事了~<p>

> ## Tips
> 覺得看不懂, 也可以記成new出來的多個相同class會共用以static修飾之變數值<p>

<div id="ppp">##public, protected, private</div>
* public意為公開, 可供其他class直接調用<p>
但基於不要讓coding人員可以隨意改變class內部參數, 造成安全性問題, 故不建議變數宣告為public(不加修飾子預設為public)<p>
通常會寫public function來使用Object中的private變數(如同上方例子中後面兩個function的示意)<p>
* protected表示保護, private表示私人<p>
public可在其他class中隨意調用此成員<p>
protected只有兄弟和子類別可調用, 不同package不行<p>
private則不可在所有其他class中隨意調用此成員<p>
而且他們在subclass繼承(inherit)後所獲得的成員也不同<p>

<div id="inherit">##繼承</div>

	parents | child
	public -> 任何class皆繼承為public
	protected -> 對同package中class者為protected, 外部class則為private
	private -> 任何class皆不可繼承, 但可透過繼承parent的public function來使用

<div id="example">##範例</div>

又扯遠了...讓我們回到main主程式和剛剛寫好的User class<p>
首先呢, 在main要這樣使用你的User class<p>

	User user = new User();

表示new了一個Object叫做user, 類型是User<p>
而我們可以以點運算子(.)使用class裡面的變數與function<p>

	System.out.println("user data: " + user.weight + ", " + user.height);
	user.weight += 20;
	user.height += 20;
	System.out.println("user data: " + user.weight + ", " + user.height);
	
再來是上方Tips提到的共用static修飾子<p>

	User user1 = new User();
	System.out.println("user1 data: " + user1.weight + ", " + user1.height);
	System.out.println("come from: " + user1.planet);
	user1.planet = "Sun";
	
	User user2 = new User();
	System.out.println("user2 data: " + user2.weight + ", " + user2.height);
	System.out.println("come from: " + user2.planet);
	
理論上一個新new的class user2 應該要印出(Earth), 但為何在接著上面運算式之後會印出user2會印出(Sun)呢?<p>
這就是因為在User中, 以static來修飾planet的關係(簡單記就想成是共用吧~)<p>

接著是

	System.out.println(user.age);
	user.age = 100;
	
兩行程式碼編譯器都會報錯<p>
就是因為在User裡面用了private修飾age變數的關係(private = 無法直接使用)<p>
剛剛說過的<p>
如果要使用private的變數, 必須以public function來存取, 如下<p>

	System.out.println(user.getAge());
	user.setAge(100);
	System.out.println(user.getAge());
	
則可以順利執行程式<p>
而以protected修飾的height, 因為是同個class中呼叫, 所以可以直接調用

	System.out.println(user.height);

再來是繼承的範例<p>
先寫個UserSpecialized繼承User<p>

	public class UserSpecialized extends User {
	
		public String getname() {
			return name;
		}
	
	}
	
extends xxx 就是繼承的格式<p>
回到main主程式<p>

	UserSpecialized user = new UserSpecialized();
	System.out.println("user data: " + user.weight + ", " + user.height);
	System.out.println("come from: " + user.planet);
	System.out.println("private: " + user.age);
	System.out.println("public function: " + user.getAge());
	
發現編譯器告訴你user.age該行不能執行, 因為age是private不可見<p>
我們必須刪掉他||註解他||更改修飾子才能執行程式<p>
再回到UserSpecialized<p>

	public String getName() {
		return name;
	}
	
	public int getAge() {
		return getAge() + 10;
	}

getName為我們新增的function
getAge override 了原本的 getAge function<p>
如果覆寫時使用age, 會無法執行, 因為age是private變數
必須透過父類別的getAge才能繼續操作<p>

> ##practice:
> 1. 創造一個calss名稱為shape,裡面有變數unit=0, 計算邊長的function(內容為空)
> 2. 創造兩個calss分別為circle, square, 他們extends shape
> 3. 更新繼承來的function, 使得在主程式呼叫circle和square可以順利算出邊長(unit在circle和square中分別代表半徑和一個邊的長度)

********

#[4. Course3.java](#0)

好的我們要開始進入圖形化介面(GUI)的世界了<p>

<div id="screenwidth">##screenwidth</div>

	int screenwidth = (int)java.awt.Toolkit.getDefaultToolkit().getScreenSize().getWidth();
	
這行程式可以取得使用者電腦的螢幕寬度<p>
意思是說在java.awt.Toolkit這個class裡面找到getDefaultToolkit function<p>
回傳一個toolkit, 在這個toolkit中呼叫getScreenSize function<p>
獲得視窗大小, 再取出寬度資料(getWidth())<p>
然後賦值給int變數screenwidth<p>

<div id="jframe">##JFrame</div>

	frm.setLayout(null);
	frm.setBounds(100,100,500,500);
	
這是剛剛new的JFrame的基礎設定<p>
要用視窗化界面首先你要有個載體, 才可以放東西在螢幕上並顯示出來, 就是用JFrame<p>
* setLayout是設定排版, 可以選擇各種排版使用, 我喜歡自己設定他們的位置所以都用null表示不用任何排版方式<p>
* setBounds意味邊界, 要傳入4個變數到該function裡面, 分別是(x座標, y座標, 寬度, 高度)<p>

再來是其他設定<p>

	frm.setUndecorated(true);
	frm.setVisible(true);
	
* setUndecorated意味著不要有JFrame原本自帶的選項框(可以不加這行自行看看差別)<p>
* setVisible是設定這個JFrmae的可見性, 要讓JFrame出現在畫面上一定要寫這行, 不然不會出現JFrame<p>

.

	frm.addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent e){
				System.exit(0);}});
	
上方這段程式碼則是為了與JFrame自帶選項框呼應, 如果用了Undecorated則可以不要加這段code<p>
意思是在按下自帶選項框的叉叉後, 會真的結束這個程式<p>
如果不加, 卻使用自帶選項框的叉叉, 你會在工作管理員裡面見到越來越多的Binary程序<p>
可以自己體會一下(笑<p>

<div id="jpanel">##JPanel</div>

	pnl = new JPanel();
	pnl.setLayout(null);
    pnl.setBounds(0,0,500,500);
	pnl.setBackground(Color.gray);
	frm.add(pnl);
	
第二個是JPanel<p>
JFrame的上方當然可以放東西, 但是如果要換畫面就要把現有東西移除, 再新增到JFrmae上, 過於不方便<p>
所以JFrame上面再加上一個面板(JPanel), 拿來方便我們在程式運行時, 簡單快速的換畫面<p>
* setBackground意思是設定pnl的背景顏色, 設為灰色<p>
* 最後一行add意思是把pnl加到frm之上<p>
不add就不會顯示囉~<p>

<div id="jbutton-font">##JButton & Font</div>

JButton就是按鈕, 可以搭配各種Object做出各種行為<p>	

	String[] s = {"a","b","c","d","e","f","g","h","lalala","dddd","abcde"};
	Font F0 = new Font("FangSong", Font.PLAIN, 20);
	for(int num=0; num<s.length; num++) {
	 	btn[num] = new JButton(s[num]);
	   	btn[num].setBounds(0 + num*51, 0, 50, 50);
	   	btn[num].setFont(F0);
	   	btn[num].setBackground(Color.gray);
	   	btn[num].setForeground(Color.white);
	    pnl.add(btn[num]);
	}

當然創Object的時候也可以用for迴圈創建<p>
* 在new JButton的那一行, 傳"s[num]"進去的原因是JButton有初始化設定可以接收字串並化為自己的名稱<p>
所以在button呈現在pnl上的時候, button上方會有著你傳入的字串<p>
而其他方法像是"setText"或"setTitle"等, 可以再改變Object上的文字<p>

* setBackground 和 setForeground分別對應著設定背景顏色和設定文字顏色<p>
* Font的宣告, 分別是(字體, 字型樣式, 大小)<p>
其中PLAIN代表普通樣式, 也可以改成BOLD(粗體)或是ITALIC(斜體)等等<p>

再來是其他敘述<p>

	btn.setOpaque(true);
	btn.setContentAreaFilled(false);
	btn.setBorderPainted(false);

* setOpaque意思是設定為不透明, 也就是該Object背景要不要顯示, 影響著看不看的到後方的Object<p>
* setContentAreaFilled意思是要不要繪製背景, 與第一行類似, 但程式運行不同<p>
* setBorderPainted設定著要不要顯示按鈕的邊界線, 請自行運行code更改boolean感受差異<p>

<div id="jlabel">##JLabel</div>

JLabel意味著標籤, 通常用來單純顯示文字用<p>

	lab = new JLabel("今天天氣真好~");
	lab.setFont(F0);
	lab.setBounds(100, 100, 200, 80);
	pnl.add(lab);
	
在此展現基本設定格式<p>

<div id="textarea">##TextArea</div>

TextArea意味著多行輸入框<p>

	txa = new TextArea("");
	txa.setFont(F0);
	txa.setBounds(100, 100, 200, 200);
	pnl.add(txa);

<div id="textfield">##TextField</div>

TextField意味著單行輸入框<p>

	txf = new TextField("132222222222222222222222222222222222");
	txf.setBounds(100, 210, 100, 100);
	txf.setFont(F0);
	pnl.add(txf);
	
<div id="two-of-action">##two of Action</div>

現在要介紹的是動作(Action)<p>
比如針對滑鼠的動作(MouseListener), 針對其他Object做動作的動作(ActionListener)等<p>
關於按下JButton要執行的動作可以有以下兩種定義方式<p>

* 1.

		btn[0].addActionListener(new ActionListener() 
		{public void actionPerformed(ActionEvent e){ 
			btn[0].setLocation(btn[0].getLocation().x + 10, btn[0].getLocation().y);
		} });

	第一種寫在function裡面<p>
	意思是對於btn[0]這個物件註冊一個Action, 只要按下按鈕, 就會以setLocation function改變btn[0]的x軸座標+10單位, 而y座標照舊<p>

* 2.

		public void actionPerformed(ActionEvent e) {
			JButton a =(JButton) e.getSource();
			a.setLocation(a.getLocation().x+30, a.getLocation().y);
		}
	
	第二種是將Action function寫在和main同階層的地方<p>
	將這個class implements ActionerListenr, 表示我要實作這個Listener<p>

		public class Course3_cont extends JFrame implements ActionListener{
			...
		}

	並在main裡面對btn註冊, 如下<p>

		btn.addActionListener(frm);

各有優缺點, 就請自行體會了~<p>

<div id="mouse-listener">##Mouse Listener</div>

最後介紹關於滑鼠的Listener<p>
要用滑鼠的Listner比較麻煩, 除了在main裡面要註冊<p>

	btn.addMouseListener(frm);

並在class implements MouseListener<p>

	public class Course3_cont extends JFrame implements MouseListener{
		...
	}

之外, 與main同階層的地方要把以下function(除了設定動作的lab.setText(xxx);)都加上去<p>

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO 自動產生的方法 Stub
		lab.setText("mouse click");
	}
	@Override
	public void mousePressed(MouseEvent e) {
		// TODO 自動產生的方法 Stub
		lab.setText("mouse press");
	}
	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO 自動產生的方法 Stub
		lab.setText("mouse release");
	}
	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO 自動產生的方法 Stub
		lab.setText("mouse enter");
	}
	@Override
	public void mouseExited(MouseEvent e) {
		// TODO 自動產生的方法 Stub
		lab.setText("mouse leave");
	}

而這5個function分別撰寫了點擊, 按下, 放開, 鼠標進入, 鼠標離開所要執行的Action<p>

> ##practice:
> 1. 創造一個頁面, 上面有兩個Label顯示食物名稱, 兩個textField給使用者輸入購買數量, 一個按鈕在按下之後可以在另外一個label顯示"您要購買X個漢堡和X個薯條"
> 2. 創造一個頁面, 上面有一個button, 當滑鼠碰到他, 他會隨機跑到畫面的某處, 使玩家按不到他

********

#[5. Course4.java](#0)

接著要來講解計時器(timer)<p>
通常我使用的時候都是複製格式, 修改裡面內容使用~<p>

<div id="timer">##timer</div>

	Timer timer = new Timer(1, null);
	timer = new Timer(1000, new ActionListener() {
       	public void actionPerformed(ActionEvent e) {
        		
        	System.out.println("a");
        }
    });
	
* 第1行是宣告樣式, 括號內意義為(每?毫秒執行一次, 內容)<p>
* 第二行則是將此timer刷新(new), 重新規劃, 每1000毫秒(1秒)執行一次, 後面public function是會執行的內容<p>

要啟動Timer, 需要在定義完Timer內容後啟動他

	timer.start();

停止則是

	timer.stop();
	

> ## Tips
> 需要注意的是如果今天尚未停止原本的timer, 就把他new了<p>
> 則接下來無法找到原來還未停止的timer<p>
> 只能控制(stop and start)新創造出來的Timer<p>
	
> ##practice:
> 1. 創造一個頁面有200個button, 其中50個會隨著時間變色, 其中50個會隨時間變大一定程度,再變小, 其中50個會左右跑碰到牆壁再返回, 最後50個會上下跑撞到牆壁再返回

> 2. 創造一個頁面, 隨著時間生成button, 上限自行設定, 出生點自行設定(隨機or中央or其他), 最後, 這些button會隨機移動, 看到其他button會遠離
	
********

#[6. Course5.java](#0)

最後則是讀寫檔案

<div id="write">##write</div>

	try {
		String str;
		FileWriter fw=new FileWriter("./file/index.txt");
		BufferedWriter bfw=new BufferedWriter(fw);
			for(int i=0;i<10;i++){
			bfw.write(Double.toString(Math.random()));
			bfw.newLine();
		}
		bfw.flush();
		fw.close();
	} catch (IOException e1) {
		// TODO 自動產生的 catch 區塊
		e1.printStackTrace();
	}

* 首先第三行雙引號內的是檔名, 可以修改路徑至想要創建檔案的地方, 否則就是在project內的第一層建立該檔名檔案<p>
* 第4行bfw宣告完到第9行flush之間, 就是你程式碼運用的位置<p>
Buffered是緩衝區的意思, 所以在使用完這個緩衝區(bfw)之後要釋放他(flush)<p>
雖然系統過一段時間會自行釋放該記憶體位置, 不過建議還是養成良好習慣手動釋放<p>
* 檔案內容有時會有換下一行的情況, 則只要使用第7行的newLine function, 接下來繼續寫入的內容就會換一行<p>

<div id="read">##read</div>

	try {
		String str;
		FileReader fr=new FileReader("./file/index.txt");
		BufferedReader bfr=new BufferedReader(fr);
		while((str=bfr.readLine())!=null)
		{
			System.out.println(str);
		}
		fr.close();
	} catch (IOException e1) {
		// TODO 自動產生的 catch 區塊
		e1.printStackTrace();
	}
	
與write很相似, 只有第5行需要特別解釋<p>

	while((str=bfr.readLine())!=null)

的意思是說<p>
bfr先取得目前檔案中的這一行, 賦值給str變數<p>
則如果str變數不為null, 執行此while迴圈<p>
執行完後會繼續readLine下一行<p>

.

********

<p>
再來就是進階課程<p>
為我在國泰到目前為止的心得歐 :P

