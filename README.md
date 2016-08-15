# androidKotlin
# 《Kotlin for android developers》中文版翻译

> 错别字、病句、翻译错误等问题可以提issues。请说明错误原因。

1. [在线阅读或下载GitBook](https://www.gitbook.com/book/wangjiegulu/kotlin-for-android-developers-zh/details)
2. [在线阅读](https://github.com/wangjiegulu/kotlin-for-android-developers-zh/blob/master/SUMMARY.md)


希望大家购买正版，建议阅读英文原版：https://leanpub.com/kotlin-for-android-developers

- Github: https://github.com/wangjiegulu/kotlin-for-android-developers-zh

# 写在前面

学习通过Kotlin语言来简单地开发android应用。
# 关于本书

在这本书中，我会使用Kotlin作为主要的语言来开发一个android应用。方式是通过开发一个应用来学习这门语言，而不是根据传统的结构来学习。我会在感兴趣的点停下来通过与Java1.7对比的方式讲讲Kotlin的一些概念和特性。用这种方法你就能知道它们的不同之处，并且知道哪部分语言特性可以让你提高你的工作效率。

这本书并不是一本语言参考书，但它是一个Android开发者去学习Kotlin并且使用在自己项目中的一个工具。我会通过使用一些语言特性和有趣的工具和库来解决很多我们在日常生活当中都会遇到的典型问题。

这本书是非常具有实践性的，所以我建议你在电脑面前跟着我的例子和代码实践。无论何时你都可以在有一些想法的时候深入到实践中去。

就如你知道的，这是一个精益出版。也就是说这本书是跟你一起写下去的。我会根据你的回复和建议来写新的内容和检查之前的内容。尽管这本书已经完成了，但是我会及时根据新的Kotlin版本更新。所以尽管编写意见告诉我你对这本书的看法，或者需要改进的地方。我希望这本书会成为Android开发者的一个完美的工具，正因为如此，欢迎大家的想法和帮助。

感谢你将成为这个激动人心的项目的一部分。
# 这本书适合你吗？

写这本书是为了帮助那些有兴趣使用Kotlin语言来进行开发的Android开发者。

如果你符合下面这些情况，那这本书是适合你的：
- 你有相关Android开发和Android SDK的基本知识。
- 你希望跟随一个使用Kotlin语言编写的例子来学习Kotlin。
- 你需要一个怎么去使用更简洁生动的语言来解决日常生活遇到的典型问题的指南。

另一方面，这本书可能不太适合你，因为：
- 这本书不是Kotlin圣经。我会去解释所有Kotlin的基本语法，甚至包括在过程中遇到我需要的一些相对比较复杂的想法。所以你是通过一个例子去学习，而不是其他方式。
- 我不会去解释怎么样去开发一个Android应用。你不需要很深的开发知识，但是至少了解基础，比如Android Studio，Gradle，Java语言和Android SDK。你可能会从中学到一些关于Android开发的一些新的东西。
- 这本书不是函数式编程语言指南。当然由于Java 7完全不是函数式风格的，我会解释你需要知道的东西，但是不会很深入地去讲解函数式编程的话题。

# 关于作者

Antonio Leiva是一个Android工程师，他专注于研究新的潜在的Android开发可能性，然后写作说明。他维护一个关于很多不同Android开发话题的博客[antonioleiva.com]。

Antonio一开始是CRM技术顾问，但是一段时间之后，他寻找着新的激情，他发现了Android世界。在优秀的平台上获得了相关经验，之后他加入了一个西班牙重要的手机公司带领多个项目作为新的冒险。

现在，他在[Plex]担任Android工程师，并且在Android的设计和UX方面也担任重要的角色。

你可以在Twitter上关注他[@lime_cl]。

[antonioleiva.com]: http://antonioleiva.com/
[Plex]: http://plex.tv/
[@lime_cl]: https://twitter.com/lime_cl

# 介绍

如果你觉得Java 7是一个过期的语言，并决定找一个更现代的语言代替。恭喜你！就如你知道的，虽然Java 8已经发布了，它包含了很多我们期待的像现代语言中那样的改善，但是我们Android开发者还是被迫在使用Java 7.这是因为法律的问题。但是就算没有这个限制，并且新的Android设备从今天开始使用新的能理解Java8的VM，在当前的设备过期、几乎没有人使用它们之前我们也不能使用Java 8，所以恐怕我们不会很快等到这一天的到来。

但是并不是没有补救的方法。多亏使用了JVM，我们可以使用任何语言去编写Android应用，只要它能够编译成JVM能够认识的字节码就可以了。

正如你所想，有很多选择，比如Groovy，Scala，Clojure，当然还有Kotlin。通过实践，只有其中一些能够被考虑来作为替代品。

上述的每一种语言都有它的利弊，如果你还没有真正确定你该使用那种语言，我建议你可以去尝试一下它们。

# 什么是Kotlin？

Kotlin，如前面所说，它是[JetBrains]开发的基于JVM的语言。JetBrains因为创造了一个强大的Java开发IDE被大家所熟知。Android Studio，官方的Android IDE，就是基于Intellij，作为一个该平台的插件。

Kotlin是使用Java开发者的思维被创建的，Intellij作为它主要的开发IDE。对于Android开发者，有两个有趣的特点：
- 对Java开发者来说，Kotlin是非常直觉化的，并且非常容易学习。语言的大部分内容都是与我们知道的非常相似，不同的地方，它的基础概念也能迅速地掌握它。
- 它与我们日常生活使用的IDE完全免费地整合。Android Studio能够非常完美地理解、编译运行Kotlin代码。而且对这门语言的支持来正是自于开发了这个IDE的公司本身，所以我们Android开发者是一等公民。
 
但是这仅仅是开发语言和开发工具之间的整合。相比Java 7的优势到底是什么呢？
- 它更加易表现：这是它最重要的优点之一。你可以编写少得多的代码。
- 它更加安全：Kotlin是空安全的，也就是说在我们编译时期就处理了各种null的情况，避免了执行时异常。如果一个对象可以是null，则我们需要明确地指定它，然后在使用它之前检查它是否是null。你可以节约很多调试空指针异常的时间，解决掉null引发的bug。
- 它是函数式的：Kotlin是基于面向对象的语言。但是就如其他很多现代的语言那样，它使用了很多函数式编程的概念，比如，使用lambda表达式来更方便地解决问题。其中一个很棒的特性就是Collections的处理方式。
- 它可以扩展函数：这意味着我们可以扩展类的更多的特性，甚至我们没有权限去访问这个类中的代码。
- 它是高度互操作性的：你可以继续使用所有的你用Java写的代码和库，因为两个语言之间的互操作性是完美的。甚至可以在一个项目中使用Kotlin和Java两种语言混合编程。


[JetBrains]: https://www.jetbrains.com/

# 我们通过Kotlin得到什么

不深入Kotlin语言（我们会在下一章再去学习），这里有一些Java中没有的有趣的特性：

## 易表现

通过Kotlin，可以更容易地避免模版代码因为大部分的典型情况都在语言中默认覆盖实现了。举个例子，在Java中，如果我们要典型的数据类，我们需要去编写（至少生成）这些代码：
```java
public class Artist {
    private long id;
    private String name;
    private String url;
    private String mbid;

    public long getId() {
        return id;
    }


    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getMbid() {
        return mbid;
    }

    public void setMbid(String mbid) {
        this.mbid = mbid;
    }

    @Override public String toString() {
        return "Artist{" +
          "id=" + id +
          ", name='" + name + '\'' +
          ", url='" + url + '\'' +
          ", mbid='" + mbid + '\'' +
          '}';
    }
}
```

使用Kotlin，我们只需要通过数据类：
```kotlin
data class Artist(
    var id: Long,
    var name: String,
    var url: String,
    var mbid: String)
```

这个数据类，它会自动生成所有属性和它们的访问器，以及一些有用的方法，比如，`toString()`

## 空安全

当我们使用Java开发的时候，我们的代码大多是防御性的。如果我们不想遇到`NullPointerException`，我们就需要在使用它之前不停地去判断它是否为null。Kotlin，如很多现代的语言，是空安全的，因为我们需要通过一个`安全调用操作符`（写做`?`）来明确地指定一个对象是否能为空。

我们可以像这样去写：
```kotlin
// 这里不能通过编译. Artist 不能是null
var notNullArtist: Artist = null

// Artist 可以是 null
var artist: Artist? = null

// 无法编译, artist可能是null，我们需要进行处理
artist.print()

// 只要在artist != null时才会打印
artist?.print()

// 智能转换. 如果我们在之前进行了空检查，则不需要使用安全调用操作符调用
if (artist != null) {
  artist.print()
}

// 只有在确保artist不是null的情况下才能这么调用，否则它会抛出异常
artist!!.print()

// 使用Elvis操作符来给定一个在是null的情况下的替代值
val name = artist?.name ?: "empty"
```

## 扩展方法

我们可以给任何类添加函数。它比那些我们项目中典型的工具类更加具有可读性。举个例子，我们可以给fragment增加一个显示toast的函数：
```kotlin
fun Fragment.toast(message: CharSequence, duration: Int = Toast.LENGTH_SHORT) { 
    Toast.makeText(getActivity(), message, duration).show()
}
```
我们现在可以这么做：
```kotlin
fragment.toast("Hello world!")
```

## 函数式支持（Lambdas）

每次我们去声明一个点击所触发的事件，可以只需要定义我们需要做些什么，而不是不得不去实现一个内部类？我们确实可以这么做，这个（或者其它更多我们感兴趣的事件）我们需要感谢lambda：
```kotlin
view.setOnClickListener { toast("Hello world!") }
```
这里只是挑选了很小一部分Kotlin可以简化我们代码的事情。现在你已经知道这门语言的一些有趣的特性了，你可以考虑它是否是适合你的。如果你选择继续，我们将在下一章开始我们的实践之旅。

# 准备工作

现在你知道使用Kotlin实现的小例子了，我确信你会希望尽可能快地把它用在你的实践当中去。不要担心，在第一章中会帮助你去搭建你的开发环境，这样你才能立即编写代码。

# Android Studio

第一件事就是安装Android Studio。就如你知道的，Android Studio是官方的Android IDE，它是2013年发布的预览版，并在2014年发布了正式版。

Android Studio是[Intellij IDEA]的插件实现，Intellij IDEA是由[JetBrains]开发，Kotlin就是JetBrains创造的。所以，正如你所见，一切都这么紧密地结合起来了。

转移Android Studio是Android开发者一个重要的改变。首先，因为我们放弃了Eclipse并转到专为Java开发者设计的完美的语言交互的软件。我们可以享受到完美的特性体验，比如反应快速和令人影响深刻的智能代码提示，还有强大的分析和重构工具。

第二，[Gradle]成为Android官方的系统构建工具，这意味着版本构建和部署的新的可能性。最有趣的两点是系统构建和flavours，它可以让你使用相同的代码库来创建无限的版本（甚至是不同的应用）。

如果你仍然在使用Eclipse，为了跟上这本书，恐怕你需要转移到Android Studio了。Kotlin团队也创建了一个针对Eclipse的插件，但是它是远远落后于Android Studio的，而且结合得也并不完美。你一旦使用了它，你就会觉得相见恨晚。

我不会去覆盖到Android Studio和Gradle的使用，因为这些都不是本书的重点，但是如果你以前没有使用过这些工具，不要恐慌，我确信你能够跟随本书的同时学习到相关基础。

如果你还没有AndroidStudio，[点这里从官网下载](https://developer.android.com/sdk/index.html)。



[JetBrains]: https://www.jetbrains.com/
[Intellij IDEA]: https://www.jetbrains.com/idea
[Gradle]: https://gradle.org/

# 安装Kotlin插件

~~IDE它本身并不能理解Kotlin。就像前面部分讲到，它是为Java开发设计的。但是Kotlin团队创建了一系列强大的插件让我们更轻松地实现。前往Android Studio的`Preferences`中`Plugin`栏，然后安装如下两个插件：~~
- ~~Kotlin：这是一个基础的插件。它能让Android Studio懂得Kotlin代码。它会每次在新的Kotlin语言版本发布的时候发布新的插件版本，这样我们可以通过它发现新版本特性和弃用的警告。这是你要使用Kotlin编写Android应用唯一的插件。但是我们现在还需要另外一个。~~
- ~~Kotlin Android Extensions：Kotlin团队还为Android开发发布了另外一个有趣的插件。这个Android Extensions可以让你自动地从XML中注入所有的View到Activity中，举个例子，你不需要使用`findViewById()`。你将会立即得到一个从属性转换过来的view。你将需要安装这个插件来使用这个特性。我们会在下一章中深入地去讲解这个。~~

因为从Intellij 15开始，插件是被默认安装了的，但是你的Android Studio可能并没有。所以你需要进入Android Studio 的Preferences的plugin栏，然后安装Kotlin插件。如果你不会就去搜索下。

现在我们的环境已经可以理解Kotlin语言了，可以就像我们使用Java一样无缝地编译它，执行它。

# 创建一个新的项目

如果你已经使用过Android Studio和Gradle，那么这一章会比较简单。我不会给出很多细节和截图，因为用户界面和细节可能会一直变化。

我们的应用是由一个简单的天气app组成，正如所使用的[Google's Beginners Course in Udacity]。我们可能会关注不同的事情，但是app的想法都是一样的，你会发现在一个典型的app里面会包括很多不同的东西。如果你的Android开发水平比较低，我推荐这个，这个过程是比较容易的。


[Google's Beginners Course in Udacity]: https://www.udacity.com/course/android-development-for-beginners--ud837

# 在Android Studio中创建一个项目

首先，打开Android Studio并选择`Create new Project`，然后它会让你输入一个名字，你可以任意取一个名字，比如：`Weather App`。然后你需要输入公司域名。如果你不会真正发布这个app，这个字段就不是特别重要了，但是如果你有的话可以使用自己的域名。然后给任意选择一个目录作为这个项目的保存地址。

下一步，它会让你选择最小的API版本。我们选择API 15，因为我们有一个库需要至少API 15才能用。无论如何你把大部分的Anroid用户作为了目标。现在不要选择任何除了手机和平板的其它平台。

最后，我们需要选择一个Activity模版来作为入口。我们可以选择`Add no Activity`然后从头开始（这是一个好的方式如果这是一个Kotlin项目的话），但是我将选择`Blank Activity`，因为我待会儿会给你展示Kotlin插件一个好玩的小特性。

暂时不用去关心Activity的名字，layout等。这些你会在下一篇中知道。如果我们需要，我待会儿会修改它。点击`Finish`然后让它继续创建项目。

# 配置Gradle

Kotlin插件包括一个让我们配置Gradle的工具。但是我还是倾向于保持我对Gradle文件读写的控制权，否则它只会变得混乱而不会变得简单。不管怎么样，在使用自动工具之前知道它是怎么工作的是个不错的主意。所以这次，我们将手动去做。

首先，你需要如下修改父`build.gradle`：
```groovy
buildscript {
    ext.support_version = '23.1.1'
    ext.kotlin_version = '1.0.0'
    ext.anko_version = '0.8.2'
    repositories {
        jcenter()
        dependencies {
            classpath 'com.android.tools.build:gradle:1.5.0'
            classpath "org.jetbrains.kotlin:kotlin-gradle-plugin:$kotlin_version"
        }
    }
}
allprojects {
    repositories {
        jcenter() 
    }
}
```
正如你看到的，我们创建了一个变量来存储当前的Kotlin版本。你读到这里的时候去检测一下最新版本，因为可能会有更新的版本已经发布了。我们需要在几个不同的地方用到那个版本号，比如你需要加上新的Kotlin插件的`dependency`。你会在你指定的那些模块中的`build.gradle`中再次需要到Kotlin标准库。

我们对于`support library`也是如此，`Anko`库也是同样的做法。用这个方式可以更方便地在一个地方修改所有的版本号。并且使用相同的版本号，更新的时候也不需要每个地方都修改。

我们会增加`Kotlin`标准库，`Anko`库，以及`Kotlin`和`Kotlin Android Extensions plugin`插件到dependencies。
```groovy
apply plugin: 'com.android.application'
apply plugin: 'kotlin-android'
apply plugin: 'kotlin-android-extensions'
android {
    ...
}

dependencies {
    compile "com.android.support:appcompat-v7:$support_version"
    compile "org.jetbrains.kotlin:kotlin-stdlib:$kotlin_version"
    compile "org.jetbrains.anko:anko-common:$anko_version"
}

buildscript {
    repositories {
jcenter() }
    dependencies {
      classpath "org.jetbrains.kotlin:kotlin-android-extensions:$kotlin_version"
    } 
}
```
Anko是一个用来简化一些Android任务的很强大的Kotlin库。我们之后将会学习部分anko，但是现在来说仅仅增加`anko-common`就足够了。这个库被分割成了一系列小的部分以至于我们不会把没用到的部分加进来。

# 把MainActivity转换成Kotlin代码

Kotlin plugin包含了一个有趣的特性，它能把Java代码转成Kotlin代码。正如任何自动化那样，结果不会很完美，但是在你第一天能够使用Kotlin语言开始编写代码之前，它还是提供了很多的帮助。

所以我们在MainActivity.java类中使用它。打开文件，然后选择`Code` -> `Convert Java File to Kotlin File`。对比它们的不同之处，可以让你更熟悉这门语言。

# 把MainActivity转换成Kotlin代码

Kotlin plugin包含了一个有趣的特性，它能把Java代码转成Kotlin代码。正如任何自动化那样，结果不会很完美，但是在你第一天能够使用Kotlin语言开始编写代码之前，它还是提供了很多的帮助。

所以我们在MainActivity.java类中使用它。打开文件，然后选择`Code` -> `Convert Java File to Kotlin File`。对比它们的不同之处，可以让你更熟悉这门语言。

# 测试是否一切就绪

我们想再将编写一些代码来测试Kotlin Android Extensions是否在工作。我现在还不会对这些代码做解释，但是我想要确保它们在你的环境中是正常运行的。这可能是配置中最难的一部分。

首先，打开`activity_main.xml`，然后设置TextView的id：
```xml
<TextView
    android:id="@+id/message"
    android:text="@string/hello_world"
    android:layout_width="wrap_content"
    android:layout_height="wrap_content"/>
```

然后，手动在Activity中增加一个import语句（不要担心你现在对这个还不太理解）。

```kotlin
import kotlinx.android.synthetic.main.activity_main.*
```

在`onCreate`中，你现在可以直接得到并访问这个TextView了。

```kotlin
override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)
    message.text = "Hello Kotlin!"
}
```

多亏Kotlin和Java之间的互操作性，我们可以在Kotlin中像操作属性一样去操作Java库中的getter/setter方法。我们之后再去讲解属性，但是我想提醒的是，我们可以使用`message.text`来代替`message.setText`。编译器将会把它转换成一般的Java代码，所以这样使用是没有任何性能开销的。

现在运行这个app，并且它是正常运行的。检查TextView是否是显示的新的内容。如果你有疑问或者想查看代码，请在[Kotlin for Android Developers repository]查看。每个章节只要修改了代码，我都会进行提交，所以一定要检查所有的代码变化。

下一章会覆盖你在转换之后的MainActivity所看到的新的东西。一旦你理解了Java和Kotlin之间的细微的变化，你将能更容易独立写新的代码了。


[Kotlin for Android Developers repository]: https://github.com/antoniolg/Kotlin-for-Android-Developers

# 类和函数

Kotlin中的类遵循一个简单的结构。尽管与Java有一点细微的差别。你可以使用[try.kotlinlang.org]在不需要一个真正的项目和不需要部署到机器的前提下来测试一些简单的代码范例。

[try.kotlinlang.org]: http://try.kotlinlang.org/

# 怎么定义一个类

如果你想定义一个类，你只需要使用`class`关键字。
```kotlin
class MainActivity{

}
```

它有一个默认唯一的构造器。我们会在以后的课程中学习在特殊的情况下创建其它额外的构造器，但是请记住大部分情况下你只需要这个默认的构造器。你只需要在类名后面写上它的参数。如果这个类没有任何内容可以省略大括号：

```kotlin
class Person(name: String, surname: String)
```

那么构造函数的函数体在哪呢？你可以写在`init`块中：
```kotlin
class Person(name: String, surname: String) {
    init{
        ...
    }
}
```
# 类继承

默认任何类都是基础继承自`Any`（与java中的`Object`类似），但是我们可以继承其它类。所有的类默认都是不可继承的（final），所以我们只能继承那些明确声明`open`或者`abstract`的类：

```kotlin
open class Animal(name: String)
class Person(name: String, surname: String) : Animal(name)
```

当我们只有单个构造器时，我们需要在从父类继承下来的构造器中指定需要的参数。这是用来替换Java中的`super`调用的。

# 函数

函数（我们Java中的方法）可以使用`fun`关键字就可以定义:

```kotlin
fun onCreate(savedInstanceState: Bundle?) {
}
```

如果你没有指定它的返回值，它就会返回`Unit`，与Java中的`void`类似，但是`Unit`是一个真正的对象。你当然也可以指定任何其它的返回类型：

```kotlin
fun add(x: Int, y: Int) : Int {
    return x + y
}
```

>小提示：分号不是必须的
>>就想你在上面的例子中看到的那样，我在每句的最后没有使用分号。当然你也可以使用分号，分号不是必须的，而且不使用分号是一个不错的实践。当你这么做了，你会发现这节约了你很多时间。

然而如果返回的结果可以使用一个表达式计算出来，你可以不使用括号而是使用等号：

```kotlin
fun add(x: Int,y: Int) : Int = x + y
```
# 函数

函数（我们Java中的方法）可以使用`fun`关键字就可以定义:

```kotlin
fun onCreate(savedInstanceState: Bundle?) {
}
```

如果你没有指定它的返回值，它就会返回`Unit`，与Java中的`void`类似，但是`Unit`是一个真正的对象。你当然也可以指定任何其它的返回类型：

```kotlin
fun add(x: Int, y: Int) : Int {
    return x + y
}
```

>小提示：分号不是必须的
>>就想你在上面的例子中看到的那样，我在每句的最后没有使用分号。当然你也可以使用分号，分号不是必须的，而且不使用分号是一个不错的实践。当你这么做了，你会发现这节约了你很多时间。

然而如果返回的结果可以使用一个表达式计算出来，你可以不使用括号而是使用等号：

```kotlin
fun add(x: Int,y: Int) : Int = x + y
```
# 构造方法和函数参数

Kotlin中的参数与Java中有些不同。如你所见，我们先写参数的名字再写它的类型：

```kotlin
fun add(x: Int, y: Int) : Int {
    return x + y
}
```

我们可以给参数指定一个默认值使得它们变得可选，这是非常有帮助的。这里有一个例子，在Activity中创建了一个函数用来toast一段信息：

```kotlin
fun toast(message: String, length: Int = Toast.LENGTH_SHORT) {
    Toast.makeText(this, message, length).show()
}
```

如你所见，第二个参数（length）指定了一个默认值。这意味着你调用的时候可以传入第二个值或者不传，这样可以避免你需要的重载函数：

```kotlin
toast("Hello")
toast("Hello", Toast.LENGTH_LONG)
```

这个与下面的Java代码是一样的：

```java
void toast(String message){
}

void toast(String message, int length){
    Toast.makeText(this, message, length).show();
}
```

这跟你想象的一样复杂。再看看这个例子：

```kotlin
fun niceToast(message: String,
                tag: String = javaClass<MainActivity>().getSimpleName(),
                length: Int = Toast.LENGTH_SHORT) {
    Toast.makeText(this, "[$className] $message", length).show()
}
```

我增加了第三个默认值是类名的tag参数。如果在Java中总数开销会以几何增长。现在可以通过以下方式调用：

```kotlin
toast("Hello")
toast("Hello", "MyTag")
toast("Hello", "MyTag", Toast.LENGTH_SHORT)
```

而且甚至还有其它选择，因为你可以使用参数名字来调用，这表示你可以通过在值前写明参数名来传入你希望的参数：

```kotlin
toast(message = "Hello", length = Toast.LENGTH_SHORT)
```

>小提示：String模版
>> 你可以在String中直接使用模版表达式。它可以帮助你很简单地在静态值和变量的基础上编写复杂的String。在上面的例子中，我使用了"[$className] $message"。

>> 如你所见，任何时候你使用一个`$`符号就可以插入一个表达式。如果这个表达式有一点复杂，你就需要使用一对大括号括起来："Your name is ${user.name}"。
# 编写你的第一个类

我们已经有了`MainActivity.kt`类。这个Activity会展示下周一系列的天气预报，所有它的layout需要有些改变。
# 创建一个layout

显示天气预报的列表我们使用`RecyclerView`，所以你需要在`build.gradle`中增加一个新的依赖：

```groovy
dependencies {
    compile fileTree(dir: 'libs', include: ['*.jar'])
    compile "com.android.support:appcompat-v7:$support_version" 
    compile "com.android.support:recyclerview-v7:$support_version" ...
}
```

然后，`activity_main.xml`如下：

```xml
<FrameLayout xmlns:android="http://schemas.android.com/apk/res/android"
             android:layout_width="match_parent"
             android:layout_height="match_parent">
    <android.support.v7.widget.RecyclerView
        android:id="@+id/forecast_list"
        android:layout_width="match_parent"
        android:layout_height="match_parent"/>
</FrameLayout>
```

在`Mainactivity.kt`中删除掉之前用来测试的能正常运行的所有代码（现在应该会提示错误）。暂且我们使用老的`findViewByid()`的方式：

```kotlin
val forecastList = findViewById(R.id.forecast_list) as RecyclerView
forecastList.layoutManager = LinearLayoutManager(this)
```

如你所见，我们定义类一个变量并转型为`RecyclerView`。这里与Java有点不同，我们会在下一章分析这些不同之处。`LayoutManager`会通过属性的方式被设置，而不是通过setter，这个layout已经足够显示一个列表了。

>对象实例化
>>对象实例化也是与Java中有些不同。如你所见，我们去掉了`new`关键字。这时构造函数仍然会被调用，但是我们省略了宝贵的四个字符。`LinearLayoutManager(this)`创建了一个对象的实例。
# The Recycler Adapter

我们同样需要一个`RecyclerView`的Adapter。[之前我在我博客中讨论过`RecyclerView`]，如果你以前没有使用过，它可能会有所帮助。

`RecyclerView`中所使用到的布局现在只需要一个`TextView`，我会手动去创建这个简单的文本列表。增加一个名为`ForecastListAdapter.kt`的Kotlin文件，包括如下代码：
```kotlin
class ForecastListAdapter(val items: List<String>) :
        RecyclerView.Adapter<ForecastListAdapter.ViewHolder>() {
        
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(TextView(parent.context))
    }
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.textView.text = items.[position]
    }
    
    override fun getItemCount(): Int = items.size
    
    class ViewHolder(val textView: TextView) : RecyclerView.ViewHolder(textView)
}
```

又是如此，我们可以像访问属性一样访问context和text。你可以保持以往那样操作（使用getters和setters）,但是你会得到一个编译器的警告。如果你还是倾向于Java中的使用方式，这个检查可以被关闭。但是一旦你使用上了这种属性调用的方式你就会爱上它，而且它也节省了额外的字符总量。

回到`MainActivity`，现在简单地创建一系列的String放入List中，然后使用创建分配Adapter实例。

```kotlin
private val items = listOf(
    "Mon 6/23 - Sunny - 31/17",
    "Tue 6/24 - Foggy - 21/8",
    "Wed 6/25 - Cloudy - 22/17",
    "Thurs 6/26 - Rainy - 18/11",
    "Fri 6/27 - Foggy - 21/10",
    "Sat 6/28 - TRAPPED IN WEATHERSTATION - 23/18",
    "Sun 6/29 - Sunny - 20/7"
    )
    
override fun onCreate(savedInstanceState: Bundle?) {
    ...
    val forecastList = findViewById(R.id.forecast_list) as RecyclerView
    forecastList.layoutManager = LinearLayoutManager(this) 
    forecastList.adapter = ForecastListAdapter(items)
}
    
```

>List的创建
>>尽管我会在本书后面来对Collection进行讲解，但是我现在仅仅简单地解释你可以通过使用一个函数`listOf`创建一个常量的List（很快我们就会讲到的`immutable`）。它接收一个任何类型的`vararg`（可变长的参数），它会自动推断出结果的类型。

>> 还有很多其它的函数可以选择，比如`setOf`，`arrayListOf`或者`hashSetOf`。

为了优化项目的结构，我也移动了一些类到新的包里面。

我们在上面很简短的代码中看到了很多新的东西，所以我会在下一章讲到它们。我们现在必须要学习一些比如基本类型，变量，属性等比较重要的概念才能继续下去。



[之前我在我博客中讨论过`RecyclerView`]: http://antonioleiva.com/recyclerview/
# 变量和属性

在Kotlin中，__一切都是对象__。没有像Java中那样的原始基本类# 基本类型

当然，像integer，float或者boolean等类型仍然存在，但是它们全部都会作为对象存在的。基本类型的名字和它们工作方式都是与Java非常相似的，但是有一些不同之处你可能需要考虑到：

- 数字类型中不会自动转型。举个例子，你不能给`Double`变量分配一个`Int`。必须要做一个明确的类型转换，可以使用众多的函数之一：

```kotlin
val i:Int=7
val d: Double = i.toDouble()
```

- 字符（Char）不能直接作为一个数字来处理。在需要时我们需要把他们转换为一个数字：

```kotlin
val c:Char='c'
val i: Int = c.toInt()
```

- 位运算也有一点不同。在Android中，我们经常在`flags`中使用“或”，所以我使用"and"和"or来举例：

```java
// Java
int bitwiseOr = FLAG1 | FLAG2;
int bitwiseAnd = FLAG1 & FLAG2;
```

```kotlin
// Kotlin
val bitwiseOr = FLAG1 or FLAG2
val bitwiseAnd = FLAG1 and FLAG2
```

>还有很多其他的位操作符，比如`sh1`, `shs`, `ushr`, `xor`或`inv`。当我们需要的时候，可以在[Kotlin官网]查看。

- 字面上可以写明具体的类型。这个不是必须的，但是一个通用的Kotlin实践时省略变量的类型（我们马上就能看到），所以我们可以让编译器自己去推断出具体的类型。

```kotlin
val i = 12 // An Int
val iHex = 0x0f // 一个十六进制的Int类型
val l = 3L // A Long
val d = 3.5 // A Double
val f = 3.5F // A Float
```

- 一个String可以像数组那样访问，并且被迭代：

```kotlin
val s = "Example"
val c = s[2] // 这是一个字符'a'
// 迭代String
val s = "Example"
for(c in s){
    print(c)
}
```

[kotlin官网]: http://kotlinlang.org/docs/reference/basic-types.html#operations型。这个是非常有帮助的，因为我们可以使用一致的方式来处理所有的可用的类型。

# 变量

变量可以很简单地定义成可变(`var`)和不可变（`val`）的变量。这个与Java中使用的`final`很相似。但是__不可变__在Kotlin（和其它很多现代语言）中是一个很重要的概念。

一个不可变对象意味着它在实例化之后就不能再去改变它的状态了。如果你需要一个这个对象修改之后的版本，那就会再创建一个新的对象。这个让编程更加具有健壮性和预估性。在Java中，大部分的对象是可变的，那就意味着任何可以访问它这个对象的代码都可以去修改它，从而影响整个程序的其它地方。

不可变对象也可以说是线程安全的，因为它们无法去改变，也不需要去定义访问控制，因为所有线程访问到的对象都是同一个。

所以在Kotlin中，如果我们想使用不可变性，我们编码时思考的方式需要有一些改变。__一个重要的概念是：尽可能地使用`val`__。除了个别情况（特别是在Android中，有很多类我们是不会去直接调用构造函数的），大多数时候是可以的。

之前提到的另一件事是我们通常不需要去指明类的类型，它会自动从后面分配的语句中推断出来，这样可以让代码更加清晰和快速修改。我们在前面已经有了一些例子：

```kotlin
val s = "Example" // A String
val i = 23 // An Int
val actionBar = supportActionBar // An ActionBar in an Activity context
```

如果我们需要使用更多的范型类型，则需要指定：

```kotlin
val a: Any = 23
val c: Context = activity
```
# 属性

属性与Java中的字段是相同的，但是更加强大。属性做的事情是字段加上getter加上setter。我们通过一个例子来比较他们的不同之处。这是Java中字段安全访问和修改所需要的代码：

```java
public class Person {
    private String name;
    public String getName() {
        return name;
    }
    public void setName(String name) { 
        this.name = name;
    }
}
...
Person person = new Person();
person.setName("name");
String name = person.getName();
```

在Kotlin中，只需要一个属性就可以了：

```kotlin
public class Person {
    var name: String = ""
}

...

val person = Person()
person.name = "name"
val name = person.name
```

如果没有任何指定，属性会默认使用getter和setter。当然它也可以修改为你自定义的代码，并且不修改存在的代码：

```kotlin
public classs Person {
    var name: String = ""
        get() = field.toUpperCase()
        set(value){
            field = "Name: $value"
        }
}
```

如果需要在getter和setter中访问这个属性自身的值，它需要创建一个`backing field`。可以使用`field`这个预留字段来访问，它会被编译器找到正在使用的并自动创建。需要注意的是，如果我们直接调用了属性，那我们会使用setter和getter而不是直接访问这个属性。`backing field`只能在属性访问器内访问。

就如在前面章节提到的，当操作Java代码的时候，Kotlin将允许使用属性的语法去访问在Java文件中定义的getter/setter方法。编译器会直接链接到它原始的getter/setter方法。所以当我们直接访问属性的时候不会有性能开销。

# Anko和扩展的函数
这个地方比较丰富，扩展性比较强






# Anko是什么？

Anko是JetBrains开发的一个强大的库。它主要的目的是用来替代以前XML的方式来使用代码生成UI布局。这是一个很有趣的特性，我推荐你可以尝试下，但是我在这个项目中暂时不使用它。对于我（可能是由于多年的UI绘制经验）来说使用XML更容易一些，但是你会喜欢那种方式的。

然而，这个不是我们能在这个库中得到的唯一一个功能。Anko包含了很多的非常有帮助的函数和属性来避免让你写很多的模版代码。我们将会通过本书见到很多例子，但是你应该快速地认识到这个库帮你解决了什么样的问题。

尽管Anko是非常有帮助的，但是我建议你要理解这个背后到底做了什么。你可以在任何时候使用`ctrl + 点击`（Windows）或者`cmd + 点击`（Mac）的方式跳转到Anko的源代码。Anko的实现方式对学习大部分的Kotlin语言都是非常有帮助的。
# 开始使用Anko

在之前，让我们来使用Anko来简化一些代码。就像你将看到的，任何时候你使用了Anko库中的某些东西，它们都会以属性名、方法等方式被导入。这是因为Anko使用了__扩展函数__在Android框架中增加了一些新的功能。我们将会在以后看到扩展函数是什么，怎么去编写它。

在`MainActivity:onCreate`，一个Anko扩展函数可以被用来简化获取一个RecyclerView：

```kotlin
val forecastList: RecyclerView = find(R.id.forecast_list)
```

我们现在还不能使用库中更多的东西，但是Anko能帮助我们简化代码，比如，实例化Intent，Activity之间的跳转，Fragment的创建，数据库的访问，Alert的创建……我们将会在实现这个App的过程中学习到很多有趣的例子。
# 扩展函数

扩展函数数是指在一个类上增加一种新的行为，甚至我们没有这个类代码的访问权限。这是一个在缺少有用函数的类上扩展的方法。在Java中，通常会实现很多带有static方法的工具类。Kotlin中扩展函数的一个优势是我们不需要在调用方法的时候把整个对象当作参数传入。扩展函数表现得就像是属于这个类的一样，而且我们可以使用`this`关键字和调用所有public方法。

举个例子，我们可以创建一个toast函数，这个函数不需要传入任何context，它可以被任何Context或者它的子类调用，比如Activity或者Service：

```kotlin
fun Context.toast(message: CharSequence, duration: Int = Toast.LENGTH_SHORT) {
    Toast.makeText(this, message, duration).show()
}
```

这个方法可以在Activity内部直接调用：

```kotlin
toast("Hello world!")
toast("Hello world!", Toast.LENGTH_LONG)
```

当然，Anko已经包括了自己的toast扩展函数，跟上面这个很相似。Anko提供了一些针对`CharSequence`和`resource`的函数，还有两个不同的toast和longToast方法：

```kotlin
toast("Hello world!")
longToast(R.id.hello_world)
```

扩展函数也可以是一个属性。所以我们可以通过相似的方法来扩展属性。下面的例子展示了使用他自己的getter/setter生成一个属性的方式。Kotlin由于互操作性的特性已经提供了这个属性，但理解扩展属性背后的思想是一个很不错的练习：

```kotlin
public var TextView.text: CharSequence
    get() = getText()
    set(v) = setText(v)
```

扩展函数并不是真正地修改了原来的类，它是以静态导入的方式来实现的。扩展函数可以被声明在任何文件中，因此有个通用的实践是把一系列有关的函数放在一个新建的文件里。

这是Anko功能背后的魔法。现在通过以上，你也可以自己创建你的魔法。

#从API中获取数据

# 执行一个请求

对于感受我们要实现的想法而言，我们目前的文本是很好开始，但是现在是时候去请求一些显示在RecyclerView上的真正的数据了。我们将会使用[OpenWeatherMap] API来获取数据，还有一些普通类来现实这个请求。多亏Kotlin非常强大的互操作性，你可以使用任何你想使用的库，比如用[Retrofit]来执行服务器请求。当只是执行一个简单的API请求，我们可以不使用任何第三方库来简单地实现。

而且，如你所见，Kotlin提供了一些扩展函数来让请求变得更简单。首先，我们要创建一个新的Request类：

```kotlin
public class Request(val url: String) {
    public fun run() {
        val forecastJsonStr = URL(url).readText()
        Log.d(javaClass.simpleName, forecastJsonStr)
    }
}
```

我们的请求很简单地接收一个url，然后读取结果并在logcat上打印json。实现非常简单，因为我们使用`readText`，这是Kotlin标准库中的扩展函数。这个方法不推荐结果很大的响应，但是在我们这个例子中已经足够好了。

如果你用这些代码去比较Java，你会发现我们仅使用标准库就节省了大量的代码。比如`HttpURLConnection`、`BufferedReader`和需要达到相同效果所必要的迭代结果，管理连接状态、reader等部分的代码。很明显，这些就是场景背后函数所作的事情，但是我们却不用关心。

为了可以执行请求，App必须要有Internet权限。所以需要在`AndroidManifest.xml`中添加：：

```xml
<uses-permission android:name="android.permission.INTERNET" />
```


[OpenWeatherMap]: http://openweathermap.org/
[Retrofit]: https://github.com/square/retrofit

# 在主线程以外执行请求

如你所知，HTTP请求不被允许在主线程中执行，否则它会抛出异常。这是因为阻塞住UI线程是一个非常差的体验。Android中通用的做法是使用`AsyncTask`，但是这些类是非常丑陋的，并且使用它们无任何副作用地实现功能也是非常困难的。如果你使用不小心，`AsyncTasks`会非常危险，因为当运行到`postExecute`时，如果Activity已经被销毁了，这里就会崩溃。

Anko提供了非常简单的DSL来处理异步任务，它满足大部分的需求。它提供了一个基本的`async`函数用于在其它线程执行代码，也可以选择通过调用`uiThread`的方式回到主线程。在子线程中执行请求如下这么简单：

```kotlin
async() {
    Request(url).run()
    uiThread { longToast("Request performed") }
}
```

`UIThread`有一个很不错的一点就是可以依赖于调用者。如果它是被一个`Activity`调用的，那么如果`activity.isFinishing()`返回`true`，则`uiThread`不会执行，这样就不会在Activity销毁的时候遇到崩溃的情况了。

假如你想使用`Future`来工作，`async`返回一个Java `Future`。而且如果你需要一个返回结果的`Future`，你可以使用`asyncResult`。

真的很简单，对吧？而且比`AsyncTasks`更加具有可读性。现在，我仅仅给请求发送了一个url，来测试我们是否可以正确接收内容，这样我们才能在Activity中把它画出来。我很快会讲到怎么去进行json解析和转换成app中的数据类，但是在我们继续之前，学习什么是数据类也是很重要的。

检查代码并审查url请求和包结构的代码。你可以运行app并且确保你可以在打印的json日志和请求完毕之后的toast。
# 数据类

数据类是一种非常强大的类，它可以让你避免创建Java中的用于保存状态但又操作非常简单的POJO的模版代码。它们通常只提供了用于访问它们属性的简单的getter和setter。定义一个新的数据类非常简单：

```kotlin
data class Forecast(val date: Date, val temperature: Float, val details: String)
```
# 额外的函数

通过数据类，我们可以方便地得到很多有趣的函数，一部分是来自属性，我们之前已经讲过（从编写getter和setter函数）：

- equals(): 它可以比较两个对象的属性来确保他们是相同的。
- hashCode(): 我们可以得到一个hash值，也是从属性中计算出来的。
- copy(): 你可以拷贝一个对象，可以根据你的需要去修改里面的属性。我们会在稍后的例子中看到。
- 一系列可以映射对象到变量中的函数。我也很快就会讲到这个。
# 复制一个数据类

如果我们使用不可修改的对象，就像我们之前讲过的，假如我们需要修改这个对象状态，必须要创建一个新的一个或者多个属性被修改的实例。这个任务是非常重复且不简洁的。

举个例子，如果我们需要修改`Forecast`中的`temperature`（温度），我们可以这么做：

```kotlin
val f1 = Forecast(Date(), 27.5f, "Shiny day")
val f2 = f1.copy(temperature = 30f)
```

如上，我们拷贝了第一个forecast对象然后只修改了`temperature`的属性而没有修改这个对象的其它状态。

> 当你使用Java类时小心“不可修改性”
> > 如果你决定使用不可修改来工作，你需要意识到Java不是根据这种思想来设计的，在某些情况下，我们仍然可以修改这些状态。在上一个例子中，你还是可以访问`Date`对象，然后改变它的值。有个简单（不安全）的方法是记住所有需要修改状态的对象作为一个规则，然后必要的时候去拷贝一份。

>> 另外一个方法是封装这些类。你可以创建一个`ImmutableDate`类，它封装了`Date`并且不允许去修改它们的状态。决定哪种方式取决于你。本书中，我不会对不可修改性太限制，所以我不会去为一些危险的类去创建一个封装类。
# 映射对象到变量中

映射对象的每一个属性到一个变量中，这个过程就是我们知道的多声明。这就是为什么会有`componentX`函数被自动创建。使用上面的`Forecast`类举个例子：

```kotlin
val f1 = Forecast(Date(), 27.5f, "Shiny day")
val (date, temperature, details) = f1
```

上面这个多声明会被编译成下面的代码：

```kotlin
val date = f1.component1()
val temperature = f1.component2()
val details = f1.component3()
```

这个特性背后的逻辑是非常强大的，它可以在很多情况下帮助我们简化代码。举个例子，`Map`类含有一些扩展函数的实现，允许它在迭代时使用key和value：

```kotlin
for ((key, value) in map) {
	Log.d("map", "key:$key, value:$value")
}
```
#解析数据
# 转换json到数据类

我们现在知道怎么去创建一个数据类，那我们开始准备去解析数据。在`date`包中，创建一个名为`ResponseClasses.kt`新的文件，如果你打开第8章中的url，你可以看到json文件整个结构。它的基本组成包括一个城市，一个系列的天气预报，这个城市有id，名字，所在的坐标。每一个天气预报有很多信息，比如日期，不同的温度，和一个由描述和图标的id。

在我们当前的UI中，我们不会去使用所有的这些数据。我们会解析所有到类里面，因为可能会在以后某些情况下会用到。以下就是我们需要使用到的类：

```kotlin
data class ForecastResult(val city: City, val list: List<Forecast>)
data class City(val id: Long, val name: String, val coord: Coordinates,
                val country: String, val population: Int)
data class Coordinates(val lon: Float, val lat: Float)
data class Forecast(val dt: Long, val temp: Temperature, val pressure: Float,
                    val humidity: Int, val weather: List<Weather>,
                    val speed: Float, val deg: Int, val clouds: Int,
                    val rain: Float)
data class Temperature(val day: Float, val min: Float, val max: Float,
                       val night: Float, val eve: Float, val morn: Float)
data class Weather(val id: Long, val main: String, val description: String,
                   val icon: String)
```

当我们使用Gson来解析json到我们的类中，这些属性的名字必须要与json中的名字一样，或者可以指定一个`serialised name`（序列化名称）。一个好的实践是，大部分的软件结构中会根据我们app中布局来解耦成不同的模型。所以我喜欢使用声明简化这些类，因为我会在app其它部分使用它之前解析这些类。属性名称与json结果中的名字是完全一样的。

现在，为了返回被解析后的结果，我们的`Request`类需要进行一些修改。它将仍然只接收一个城市的`zipcode`作为参数而不是一个完整的url，因此这样变得更加具有可读性。现在，我会把这个静态的url放在一个`companion object`（伴随对象）中。如果我们之后还要对该API增加更多请求，我们需要提取它。

> __Companion objects__
>> Kotlin允许我们去定义一些行为与静态对象一样的对象。尽管这些对象可以用众所周知的模式来实现，比如容易实现的单例模式。

>> 我们需要一个类里面有一些静态的属性、常量或者函数，我们可以使用`companion objecvt`。这个对象被这个类的所有对象所共享，就像Java中的静态属性或者方法。

以下是最后的代码：

```kotlin
public class ForecastRequest(val zipCode: String) {
    companion object {
        private val APP_ID = "15646a06818f61f7b8d7823ca833e1ce"
        private val URL = "http://api.openweathermap.org/data/2.5/" +
                "forecast/daily?mode=json&units=metric&cnt=7"
        private val COMPLETE_URL = "$URL&APPID=$APP_ID&q="
	}
	
    fun execute(): ForecastResult {
        val forecastJsonStr = URL(COMPLETE_URL + zipCode).readText()
        return Gson().fromJson(forecastJsonStr, ForecastResult::class.java)
	}
}

```

记得在`build.gradle`中增加你需要的Gson依赖：

```groovy
compile "com.google.code.gson:gson:2.4"
```
# 构建domain层

我们现在创建一个新的包作为`domain`层。这一层中会包含一些`Commands`的实现来为app执行任务。

首先，必须要定义一个`Command`：

```kotlin
public interface Command<T> {
	fun execute(): T
}
```

这个command会执行一个操作并且返回某种类型的对象，这个类型可以通过范型被指定。你需要知道一个有趣的概念，__一切kotlin函数都会返回一个值__。如果没有指定，它就默认返回一个`Unit`类。所以如果我们想让Command不返回数据，我们可以指定它的类型为Unit。

Kotlin中的接口比Java（Java 8以前）中的强大多了，因为它们可以包含代码。但是我们现在不需要更多的代码，以后的章节中会仔细讲这个话题。

第一个command需要去请求天气预报结构然后转换结果为domain类。下面这些类会在domain类中被定义：

```kotlin
data class ForecastList(val city: String, val country: String,
                        val dailyForecast:List<Forecast>)

data class Forecast(val date: String, val description: String, val high: Int,
                    val low: Int)
```

当更多的功能被增加，这些类可能会需要在以后被审查。但是现在这些类对我们来说已经足够了。

这些类必须从数据映射到我们的domain类，所以我接下来需要创建一个`DataMapper`：

```kotlin
public class ForecastDataMapper {
    fun convertFromDataModel(forecast: ForecastResult): ForecastList {
        return ForecastList(forecast.city.name, forecast.city.country,
                convertForecastListToDomain(forecast.list))
    private fun convertForecastListToDomain(list: List<Forecast>):
            List<ModelForecast> {
        return list.map { convertForecastItemToDomain(it) }
    }
    private fun convertForecastItemToDomain(forecast: Forecast): ModelForecast {
        return ModelForecast(convertDate(forecast.dt),
                forecast.weather[0].description, forecast.temp.max.toInt(),
                forecast.temp.min.toInt())
}
    private fun convertDate(date: Long): String {
        val df = DateFormat.getDateInstance(DateFormat.MEDIUM, Locale.getDefault())
		return df.format(date * 1000)
	}
}
```

当我们使用了两个相同名字的类，我们可以给其中一个指定一个别名，这样我们就不需要写完整的包名了：

```kotlin
import com.antonioleiva.weatherapp.domain.model.Forecast as ModelForecast
```

这些代码中另一个有趣的是我们从一个forecast list中转换为domain model的方法：

```kotlin
return list.map { convertForecastItemToDomain(it) }
```

这一条语句，我们就可以循环这个集合并且返回一个转换后的新的List。Kotlin在List中提供了很多不错的函数操作符，它们可以在这个List的每个item中应用这个操作并且任何方式转换它们。对比Java 7，这是Kotlin其中一个强大的功能。我们很快就会查看所有不同的操作符。知道它们的存在是很重要的，因为它们要方便得多，并可以节省很多时间和模版。

现在，编写命令前的准备就绪：

```kotlin
class RequestForecastCommand(val zipCode: String) :
				Command<ForecastList> {
	override fun execute(): ForecastList {
	    val forecastRequest = ForecastRequest(zipCode)
	    return ForecastDataMapper().convertFromDataModel(
	            forecastRequest.execute())
	}
}
```
# 在UI中绘制数据

`MainActivity`中的代码有些小的改动，因为现在有真实的数据需要填充到adapter中。异步调用需要被重写成：

```kotlin
async() {
	val result = RequestForecastCommand("94043").execute()
	uiThread{
		forecastList.adapter = ForecastListAdapter(result)
	}
}
```

Adapter也需要被修改：

```kotlin
class ForecastListAdapter(val weekForecast: ForecastList) :
        RecyclerView.Adapter<ForecastListAdapter.ViewHolder>() {
        
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int):
            ViewHolder? {
        return ViewHolder(TextView(parent.getContext()))
    }
        
    override fun onBindViewHolder(holder: ViewHolder,
            position: Int) {
        with(weekForecast.dailyForecast[position]) {
            holder.textView.text = "$date - $description - $high/$low"
	} 
}
    override fun getItemCount(): Int = weekForecast.dailyForecast.size
    
    class ViewHolder(val textView: TextView) : RecyclerView.ViewHolder(textView)
}
```

> __with函数__
> > with是一个非常有用的函数，它包含在Kotlin的标准库中。它接收一个对象和一个扩展函数作为它的参数，然后使这个对象扩展这个函数。这表示所有我们在括号中编写的代码都是作为对象（第一个参数）的一个扩展函数，我们可以就像作为this一样使用所有它的public方法和属性。当我们针对同一个对象做很多操作的时候这个非常有利于简化代码。

在这一章中有很多新的代码加入，所以检出[库中]的代码吧。

[库中]: https://github.com/antoniolg/Kotlin-for-Android-Developers
# 操作符重载

Kotin有一些固定数量象征性的操作符，我们可以在任何类中很容易地使用它们。方法是创建一个方法，方法名为保留的操作符关键字，这样就可以让这个操作符的行为映射到这个方法。重载这些操作符可以增加代码可读性和简洁性。
# 操作符表

这里你可以看见一系列包括`操作符`和`对应方法`的表。对应方法必须在指定的类中通过各种可能性被实现。

__一元操作符__

| 操作符 | 函数|
|----|
| +a | a.unaryPlus() |
| -a | a.unaryMinus() |
| !a | a.not() |
| a++ | a.inc() |
| a-- | a.dec() |
<br/>
__二元操作符__

| 操作符 | 函数|
|----|
| a + b | a.plus(b) |
| a - b | a.minus(b) |
| a * b | a.times(b) |
| a / b | a.div(b) |
| a % b | a.mod(b) |
| a..b | a.rangeTo(b) |
| a in b | a.contains(b) |
| a !in b | !a.contains(b) |
| a += b | a.plusAssign(b) |
| a -= b | a.minusAssign(b) |
| a *= b | a.timesAssign(b) |
| a /= b | a.divAssign(b) |
| a %= b | a.modAssign(b) |
<br/>
__数组操作符__

| 操作符 | 函数|
|----|
| a[i] | a.get(i) |
| a[i, j] | a.get(i, j) |
| a[i\_1, ..., i\_n] | a.get(i\_1, ..., i\_n) |
| a[i] = b | a.set(i, b) |
| a[i, j] = b | a.set(i, j, b) |
| a[i\_1, ..., i\_n] = b | a.set(i\_1, ..., i\_n, b) |
<br/>
__等于操作符__

| 操作符 | 函数|
|----|
| a == b | a?.equals(b) ?: b === null |
| a != b | !(a?.equals(b) ?: b === null) |

相等操作符有一点不同，为了达到正确合适的相等检查做了更复杂的转换，因为要得到一个确切的函数结构比较，不仅仅是指定的名称。方法必须要如下准确地被实现：

```kotlin
operator fun equals(other: Any?): Boolean
```
操作符`===`和`!==`用来做身份检查（它们分别是Java中的`==`和`!=`），并且它们不能被重载。

<br/>
__函数调用__

| 方法 | 调用 |
|----|
| a(i) | a.invoke(i) |
| a(i, j) | a.invoke(i, j) |
| a(i\_1, ..., i\_n)| a.invoke(i\_1, ..., i\_n) |
# 例子

你可以想象，Kotlin List是实现了数组操作符的，所以我们可以像Java中的数组一样访问List的每一项。除此之外：在可修改的List中，每一项也可以用一个简单的方式被直接设置：

```kotlin
val x = myList[2]
myList[2] = 4
```

如果你还记得，我们有一个叫ForecastList的数据类，它是由很多其他额外的信息组成的。有趣的是可以直接访问它的每一项而不是请求内部的list得到某一项。做一个完全不相关的事情，我要去实现一个`size()`方法，它能稍微能简化一点当前的Adapter：

```kotlin
data class ForecastList(val city: String, val country: String,
                        val dailyForecast: List<Forecast>) {
    operator fun get(position: Int): Forecast = dailyForecast[position]
    fun size(): Int = dailyForecast.size
}
```

它会使我们的`onBindViewHolder`更简单一点：

```kotlin
override fun onBindViewHolder(holder: ViewHolder,
        position: Int) {
	with(weekForecast[position]) {
	    holder.textView.text = "$date - $description - $high/$low"
	}
}
```

当然还有`getItemCount()`方法：

```kotlin
override fun getItemCount(): Int = weekForecast.size()
```
# 扩展函数中的操作符

我们不需要去扩展我们自己的类，但是我需要去使用扩展函数扩展我们已经存在的类来让第三方的库能提供更多的操作。几个例子，我们可以去像访问List的方式去访问`ViewGroup`的view：

```kotlin
operator fun ViewGroup.get(position: Int): View = getChildAt(position)
```

现在真的可以非常简单地从一个`ViewGroup`中通过position得到一个view：

```kotlin
val container: ViewGroup = find(R.id.container)
val view = container[2]
```

别忘了去[Kotlin for Android developers repository]去查看这些代码。

[Kotlin for Android developers repository]:  https://github.com/antoniolg/Kotlin-for-Android-Developers
# 使Forecast list可点击

作为一个真正的app，当前列表的每一个item布局应该做一些工作。第一件事就是创建一个合适的XML，能符合我们的需要就行。我们希望显示一个图标，日期，描述以及最高和最低温度。所以让我们创建一个名为`item_forecast.xml`的layout：

```xml
<?xml version="1.0" encoding="utf-8"?>
<LinearLayout
	xmlns:android="http://schemas.android.com/apk/res/android"
	xmlns:tools="http://schemas.android.com/tools"
	android:layout_width="match_parent"
	android:layout_height="match_parent"
	android:padding="@dimen/spacing_xlarge"
	android:background="?attr/selectableItemBackground"
	android:gravity="center_vertical"
	android:orientation="horizontal">
	
	<ImageView
		android:id="@+id/icon"
		android:layout_width="48dp"
		android:layout_height="48dp"
		tools:src="@mipmap/ic_launcher"/>
	
	<LinearLayout
		android:layout_width="0dp"
		android:layout_height="wrap_content"
		android:layout_weight="1"
		android:layout_marginLeft="@dimen/spacing_xlarge"
		android:layout_marginRight="@dimen/spacing_xlarge"
		android:orientation="vertical">
	
	<TextView
		android:id="@+id/date"
		android:layout_width="match_parent"
		android:layout_height="wrap_content"
		android:textAppearance="@style/TextAppearance.AppCompat.Medium"
		tools:text="May 14, 2015"/>
	
	<TextView
		android:id="@+id/description"
		android:layout_width="match_parent"
		android:layout_height="wrap_content"
		android:textAppearance="@style/TextAppearance.AppCompat.Caption"
		tools:text="Light Rain"/>
	
	</LinearLayout>
	<LinearLayout
		android:layout_width="wrap_content"
		android:layout_height="wrap_content"
		android:gravity="center_horizontal"
		android:orientation="vertical">
	
	<TextView
		android:id="@+id/maxTemperature"
		android:layout_width="wrap_content"
		android:layout_height="wrap_content"
		android:textAppearance="@style/TextAppearance.AppCompat.Medium"
		tools:text="30"/>
	
	<TextView
		android:id="@+id/minTemperature"
		android:layout_width="wrap_content"
		android:layout_height="wrap_content"
		android:textAppearance="@style/TextAppearance.AppCompat.Caption"
		tools:text="15"/>
	
	</LinearLayout>
</LinearLayout>
```

Domain model和数据映射时必须生成完整的图标uil，所以我们可以这样去加载它：

```kotlin
data class Forecast(val date: String, val description: String,
					val high: Int, val low: Int, val iconUrl: String)
```

在`ForecastDataMapper`中：

```kotlin
private fun convertForecastItemToDomain(forecast: Forecast): ModelForecast {
    return ModelForecast(convertDate(forecast.dt),
            forecast.weather[0].description, forecast.temp.max.toInt(),
            forecast.temp.min.toInt(), generateIconUrl(forecast.weather[0].icon))
}

private fun generateIconUrl(iconCode: String): String
        = "http://openweathermap.org/img/w/$iconCode.png"
```

我们从第一个请求中得到图标的code，用来组成完成的图标url。加载图片最简单的方式是使用图片加载库。[`Picasso`]是一个不错的选择。它需要加到`build.gradle`的依赖中：

```groovy
compile "com.squareup.picasso:picasso:<version>"
```

如此，Adapter也需要一个大的改动了。还需要一个click listener，我们来定义它：

```kotlin
public interface OnItemClickListener {
     operator fun invoke(forecast: Forecast)
}
```

如果你还记得上一课程，当被调用时`invoke`方法可以被省略。所以我们来使用它来简化。listener可以被以下两种方式调用：

```kotlin
itemClick.invoke(forecast)
itemClick(forecast)
```

`ViewHolder`将负责去绑定数据到新的View：

```kotlin
class ViewHolder(view: View, val itemClick: OnItemClickListener) :
				RecyclerView.ViewHolder(view) {
    private val iconView: ImageView
    private val dateView: TextView
    private val descriptionView: TextView
    private val maxTemperatureView: TextView
    private val minTemperatureView: TextView

    init {
    	iconView = view.find(R.id.icon)
    	dateView = view.find(R.id.date)
    	descriptionView = view.find(R.id.description)
    	maxTemperatureView = view.find(R.id.maxTemperature)
    	minTemperatureView = view.find(R.id.minTemperature)
    }

    fun bindForecast(forecast: Forecast) {
    	with(forecast) {
    	    Picasso.with(itemView.ctx).load(iconUrl).into(iconView)
    	    dateView.text = date
    	    descriptionView.text = description
    	    maxTemperatureView.text = "${high.toString()}"
    	    minTemperatureView.text = "${low.toString()}"
    	    itemView.setOnClickListener { itemClick(forecast) }
	    }
    }
}
```

现在Adapter的构造方法接收一个`itemClick`。创建和绑定数据也是更简单：

```kotlin
public class ForecastListAdapter(val weekForecast: ForecastList,
         val itemClick: ForecastListAdapter.OnItemClickListener) :
        RecyclerView.Adapter<ForecastListAdapter.ViewHolder>() {
        
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int):
            ViewHolder {
        val view = LayoutInflater.from(parent.ctx)
            .inflate(R.layout.item_forecast, parent, false)
        return ViewHolder(view, itemClick)
    }
    
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bindForecast(weekForecast[position])
	}
	...
}
```

如果你使用了上面这些代码，`parent.ctx`不会被编译成功。Anko提供了大量的扩展函数来让Android编程更简单。举个例子，activitys、fragments以及其它包含了`ctx`这个属性，通过`ctx`这个属性来返回context，但是在View中缺少这个属性。所以我们要创建一个新的名叫`ViewExtensions.kt`文件来代替`ui.utils`，然后增加这个扩展属性：

```kotlin
val View.ctx: Context
    get() = context
```

从现在开始，任何View都可以使用这个属性了。这个不是必须的，因为你可以使用扩展的context属性，但是我觉得如果我们使用`ctx`的话在其它类中也会更有连贯性。而且，这是一个很好的怎么去使用扩展属性的例子。

最后，MainActivity调用setAdapter，最后结果是这样的：
```kotlin
forecastList.adapter = ForecastListAdapter(result,
        object : ForecastListAdapter.OnItemClickListener{
			override fun invoke(forecast: Forecast) {
			    toast(forecast.date)
		    }
	    })
```

如你所见，创建一个匿名内部类，我们去创建了一个实现了刚刚创建的接口的对象。看起来不是很好，对吧？这是因为我们还没开始试使用另一个强大的函数式编程的特性，但是你将会在下一章中学习到怎么去把这些代码转换得更简单。

去代码库中更新新的代码。UI开始看起来更好了。

[`Picasso`]: http://square.github.io/picasso/
# Lambdas

Lambda表达式是一种很简单的方法，去定义一个匿名函数。Lambda是非常有用的，因为它们避免我们去写一些包含了某些函数的抽象类或者接口，然后在类中去实现它们。在Kotlin，我们把一个函数作为另一个函数的参数。
# 简化setOnClickListener()

我们用Android中非常典型的例子去解释它是怎么工作的：`View.setOnClickListener()`方法。如果我们想用Java的方式去增加点击事件的回调，我首先要编写一个`OnClickListener`接口：

```java
public interface OnClickListener {
    void onClick(View v);
}
```

然后我们要编写一个匿名内部类去实现这个接口：

```java
view.setOnClickListener(new OnClickListener(){
	@Override
	public void onClick(View v) {
		Toast.makeText(v.getContext(), "Click", Toast.LENGTH_SHORT).show();
	}
})
```

我们将把上面的代码转换成Kotlin（使用了Anko的toast函数）：

```kotlin
view.setOnClickListener(object : OnClickListener {
	override fun onClick(v: View) {
		toast("Click")
	}
}
```

很幸运的是，Kotlin允许Java库的一些优化，Interface中包含单个函数可以被替代为一个函数。如果我们这么去定义了，它会正常执行：

```kotlin
fun setOnClickListener(listener: (View) -> Unit)
```

一个lambda表达式通过参数的形式被定义在箭头的左边（被圆括号包围），然后在箭头的右边返回结果值。在这个例子中，我们接收一个View，然后返回一个Unit（没有东西）。所以根据这种思想，我们可以把前面的代码简化成这样：

```kotlin
view.setOnClickListener({ view -> toast("Click")})
```

这是非常棒的简化！当我们定义了一个方法，我们必须使用大括号包围，然后在箭头的左边指定参数，在箭头的右边返回函数执行的结果。如果左边的参数没有使用到，我们甚至可以省略左边的参数：

```kotlin
view.setOnClickListener({ toast("Click") })
```

如果这个函数的最后一个参数是一个函数，我们可以把这个函数移动到圆括号外面：

```kotlin
view.setOnClickListener() { toast("Click") }
```

并且，最后，如果这个函数只有一个参数，我们可以省略这个圆括号：

```kotlin
view.setOnClickListener { toast("Click") }
```

比原始的Java代码简短了5倍多，并且更加容易理解它所做的事情。非常让人影响深刻。

# ForecastListAdapter的click listener

在前面一章，我这么艰苦地写了click listener的目的就是更好的在这一章中进行开发。然而现在是时候把你学到的东西用到实践中去了。我们从ForecastListAdapter中删除了listener接口，然后使用lambda代替：

```kotlin
public class ForecastListAdapter(val weekForecast: ForecastList,
								 val itemClick: (Forecast) -> Unit)
```

这个itemClick函数接收一个`forecast`参数然后不返回任何东西。`ViewHolder`中也可以这么修改：

```kotlin
class ViewHolder(view: View, val itemClick: (Forecast) -> Unit)
```

其它的代码保持不变。仅仅改变`MainActivity`：

```kotlin
val adapter = ForecastListAdapter(result) { forecast -> toast(forecast.date) }
```

我们可以简化最后一句。如果这个函数只接收一个参数，那我们可以使用`it`引用，而不用去指定左边的参数。所以我们可以这么做：

```kotlin
val adapter = ForecastListAdapter(result) { toast(it.date) }
```
'

# 扩展语言

多亏这些改变，我们可以去创建自己的`builder`和代码块。我们已经在使用一些有趣的函数，比如`with`。如下简单的实现：

```kotlin
inline fun <T> with(t: T, body: T.() -> Unit) { t.body() }
```

这个函数接收一个`T`类型的对象和一个被作为扩展函数的函数。它的实现仅仅是让这个对象去执行这个函数。因为第二个参数是一个函数，所以我们可以把它放在圆括号外面，所以我们可以创建一个代码块，在这这个代码块中我们可以使用`this`和直接访问所有的public的方法和属性：

```kotlin
with(forecast) {
	Picasso.with(itemView.ctx).load(iconUrl).into(iconView)
	dateView.text = date
	descriptionView.text = description
	maxTemperatureView.text = "$high"
	minTemperatureView.text = "$low"
	itemView.setOnClickListener { itemClick(this) }
}
```

> 内联函数
>> 内联函数与普通的函数有点不同。一个内联函数会在编译的时候被替换掉，而不是真正的方法调用。这在一些情况下可以减少内存分配和运行时开销。举个例子，如果我们有一个函数，只接收一个函数作为它的参数。如果是一个普通的函数，内部会创建一个含有那个函数的对象。另一方面，内联函数会把我们调用这个函数的地方替换掉，所以它不需要为此生成一个内部的对象。

另一个例子：我们可以创建代码块只提供`Lollipop`或者更高版本来执行：

```kotlin
inline fun supportsLollipop(code: () -> Unit) {
	if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
		code()
	}
}
```

它只是检查版本，然后如果满足条件则去执行。现在我们可以这么做：

```kotlin
supportsLollipop {
	window.setStatusBarColor(Color.BLACK)
}
```

举个例子，Anko也是基于这个思想来实现`Android Layout`的`DSL`化。你也可以查看`Kotlin reference`中[`使用DSL来编写HTML`]的一个例子。

[`使用DSL来编写HTML`]: http://kotlinlang.org/docs/reference/type-safe-builders.html
# 可见性修饰符

Kotlin中这些修饰符是与我们Java中的使用是有些不同的。在这个语言中默认的修饰符是`public`，这节约了很多的时间和字符。但是这里有一个详细的解释关于在Kotlin中不同的可见性修饰符是怎么工作的。
# 修饰符

### private

`private`修饰符是我们使用的最限制的修饰符。它表示它只能被自己所在的文件可见。所以如果我们给一个类声明为`private`，我们就不能在定义这个类之外的文件中使用它。

另一方面，如果我们在一个类里面使用了`private `修饰符，那访问权限就被限制在这个类里面了。甚至是继承这个类的子类也不能使用它。

所以一等公民，类、对象、接口……（也就是包成员）如果被定义为`private`，那么它们只会对被定义所在的文件可见。如果被定义在了类或者接口中，那它们只对这个类或者接口可见。

### protected

这个修饰符只能被用在类或者接口中的成员上。一个包成员不能被定义为`protected`。定义在一个成员中，就与Java中的方式一样了：它可以被成员自己和继承它的成员可见（比如，类和它的子类）。

### internal

如果是一个定义为`internal`的包成员的话，对所在的整个`module`可见。如果它是一个其它领域的成员，它就需要依赖那个领域的可见性了。比如，如果我们写了一个`private`类，那么它的`internal`修饰的函数的可见性就会限制与它所在的这个类的可见性。

我们可以访问同一个`module`中的`internal`修饰的类，但是不能访问其它`module`的。

> 什么是`module`
>>  根据Jetbrains的定义，一个`module`应该是一个单独的功能性的单位，它应该是可以被单独编译、运行、测试、debug的。根据我们项目不同的模块，可以在Android Studio中创建不同的`module`。在Eclipse中，这些`module`可以认为是在一个`workspace`中的不同的`project`。

### public

你应该可以才想到，这是最没有限制的修饰符。__这是默认的修饰符__，成员在任何地方被修饰为`public`，很明显它只限制于它的领域。一个定义为`public`的成员被包含在一个`private`修饰的类中，这个成员在这个类以外也是不可见的。
# 构造器

所有构造函数默认都是`public`的，它们类是可见的，可以被其它地方使用。我们也可以使用这个语法来把构造函数修改为`private`：

```kotlin
class C private constructor(a: Int) { ... }
```

# 润色我们的代码

我们已经准备好使用`public`来进行重构了，但是我们还有很多其它细节需要修改。比如，在`RequestForecastCommand`中，我们在构造函数中我们创建的属性`zipCode`可以定义为`private`：

```kotlin
class RequestForecastCommand(private val zipCode: String)
```

所作的事情就是我们创建了一个不可修改的属性zipCode，它的值我们只能去得到，不能去修改它。所以这个不大的改动让代码看起来更加清晰。如果我们在编写类的时候，你觉得某些属性因为是什么原因不能对别人可见，那就把它定义为`private`。

而且，在Kotlin中，我们不需要去指定一个函数的返回值类型，它可以让编译器推断出来。举个省略返回值类型的例子：

```kotlin
data class ForecastList(...) {
	fun get(position: Int) = dailyForecast[position]
	fun size() = dailyForecast.size()
}
```

我们可以省略返回值类型的典型情景是当我们要给一个函数或者一个属性赋值的时候。而不需要去写代码块去实现。

剩下的修改是相当简单的，你可以在代码库中去同步下来。
# Kotlin Android Extensions

另一个Kotlin团队研发的可以让开发更简单的插件是`Kotlin Android Extensions`。当前仅仅包括了view的绑定。这个插件自动创建了很多的属性来让我们直接访问XML中的view。这种方式不需要你在开始使用之前明确地从布局中去找到这些views。

这些属性的名字就是来自对应view的id，所以我们取id的时候要十分小心，因为它们将会是我们类中非常重要的一部分。这些属性的类型也是来自XML中的，所以我们不需要去进行额外的类型转换。

`Kotlin Android Extensions`的一个优点是它不需要在我们的代码中依赖其它额外的库。它仅仅由插件组层，需要时用于生成工作所需的代码，只需要依赖于Kotlin的标准库。

那它背后是怎么工作的？该插件会代替任何属性调用函数，比如获取到view并具有缓存功能，以免每次属性被调用都会去重新获取这个view。需要注意的是这个缓存装置只会在`Activity`或者`Fragment`中才有效。如果它是在一个扩展函数中增加的，这个缓存就会被跳过，因为它可以被用在`Activity`中但是插件不能被修改，所以不需要再去增加一个缓存功能。

# 怎么去使用Kotlin Android Extensions

如果你还记得，现在项目已经准备好去使用Kotlin Android Extensions。当我们创建这个项目，我们就已经在`build.gradle`中增加了这个依赖：

```groovy
buldscript{
	repositories {
		jcenter()
	}
	dependencies {
		classpath "org.jetbrains.kotlin:kotlin-android-extensions:$kotlin_version"
	}
}
```

唯一一件需要这个插件做的事情是在类中增加一个特定的"手工"`import`来使用这个功能。我们有两个方法来使用它：

#### `Activities`或者`Fragments`的`Android Extensions`

这是最典型的使用方式。它们可以作为`activity`或`fragment`的属性是可以被访问的。属性的名字就是XML中对应view的id。

我们需要使用的`import`语句以`kotlin.android.synthetic`开头，然后加上我们要绑定到Activity的布局XML的名字：

```kotlin
import kotlinx.android.synthetic.activity_main.*
```

此后，我们就可以在`setContentView`被调用后访问这些view。新的Android Studio版本中可以通过使用`include`标签在Activity默认布局中增加内嵌的布局。很重要的一点是，针对这些布局，我们也需要增加手工的import：

```kotlin
import kotlinx.android.synthetic.activity_main.*
import kotlinx.android.synthetic.content_main.*
```

#### `Views`的`Android Extensions`

前面说的使用还是有局限性的，因为可能有很多代码需要访问XML中的view。比如，一个自定义view或者一个adapter。举个例子，绑定一个xml中的view到另一个view。唯一不同的就是需要`import`：

```kotlin
import kotlinx.android.synthetic.view_item.view.*
```

如果我们需要一个adapter，比如，我们现在要从inflater的View中访问属性：

```kotlin
view.textView.text = "Hello"
```
# 重构我们的代码

现在是时候使用`Kotlin Android Extensions`来修改我们的代码了。修改相当简单。

我们从`MainActivity`开始。我们当前只是使用了`forecastList`的RecyclerView。但是我们可以简化一点代码。首先，为`activity_main`XML增加手工import：

```kotlin
import kotlinx.android.synthetic.activity_main.*
```

之前说过，我们使用id来访问views。所以我要修改`RecyclerView`的id，不使用下划线，让它更加适合Kotlin变量的名字。XML最后如下：

```xml
<FrameLayout
    xmlns:android="http://schemas.android.com/apk/res/android"
    android:layout_width="match_parent"
    android:layout_height="match_parent">
    <android.support.v7.widget.RecyclerView
        android:id="@+id/forecastList"
        android:layout_width="match_parent"
        android:layout_height="match_parent"/>
</FrameLayout>
```

然后现在，我们可以不需要`find`这一行了：

```kotlin
override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)
    forecastList.layoutManager = LinearLayoutManager(this)
    ...
}
```

这已经是最小的简化了，因为这个布局非常简单。但是`ForecastListAdapter`也可以从这个插件中受益。这里你可以使用一个装置来绑定这些属性到view中，它可以帮助我们移除所有`ViewHolder`的`find`代码。

首先，为`item_forecast`增加手工导入：

```kotlin
import kotlinx.android.synthetic.item_forecast.view.*
```

然后现在我们可以在`ViewHolder`中使用包含在`itemView`中的属性。实际上你可以在任何view中使用这些属性，但是很显然如果view不包含要获取的子view就会奔溃。

现在我们可以直接访问view的属性了：

```kotlin
class ViewHolder(view: View, val itemClick: (Forecast) -> Unit) :
        RecyclerView.ViewHolder(view) {
    fun bindForecast(forecast: Forecast) {
        with(forecast){
	        Picasso.with(itemView.ctx).load(iconUrl).into(itemView.icon)
			itemView.date.text = date
			itemView.description.text = description
			itemView.maxTemperature.text = "${high.toString()}￿￿"
			itemView.minTemperature.text = "${low.toString()}￿￿"
			itemView.onClick { itemClick(forecast) }
		} 
	}
}
```

Kotlin Android Extensions插件帮助我们减少了很多模版代码，并且简化了我们访问view的方式。从库中检出最新的代码吧。
# Application单例化和属性的Delegated

我们很快要去实现一个数据库，如果我们想要保持我们代码的简洁性和层次性（而不是把所有代码添加到Activity中），我们就要需要有一个更简单的访问application context的方式。
# Applicaton单例化

按照我们在Java中一样创建一个单例最简单的方式：

```kotlin
class App : Application() {
    companion object {
        private var instance: Application? = null
	    fun instance() = instance!!
    }
    override fun onCreate() {
        super.onCreate()
        instance = this
	}
}
```

为了这个Application实例被使用，要记得在`AndroidManifest.xml`中增加这个`App`：

```xml
<application
    android:allowBackup="true"
    android:icon="@mipmap/ic_launcher"
    android:label="@string/app_name"
    android:theme="@style/AppTheme"
    android:name=".ui.App">
    ...
</application>
```

Android有一个问题，就是我们不能去控制很多类的构造函数。比如，我们不能初始化一个非null属性，因为它的值需要在构造函数中去定义。所以我们需要一个可null的变量，和一个返回非null值的函数。我们知道我们一直都有一个`App`实例，但是在它调用`onCreate`之前我们不能去操作任何事情，所以我们为了安全性，我们假设`instance()`函数将会总是返回一个非null的`app`实例。

但是这个方案看起来有点不自然。我们需要定义个一个属性（已经有了getter和setter），然后通过一个函数来返回那个属性。我们有其他方法去达到相似的效果么？是的，我们可以通过委托这个属性的值给另外一个类。这个就是我们知道的`委托属性`。
# 委托属性

我们可能需要一个属性具有一些相同的行为，使用`lazy`或者`observable`可以被很有趣地实现重用。而不是一次又一次地去声明那些相同的代码，Kotlin提供了一个委托属性到一个类的方法。这就是我们知道的`委托属性`。

当我们使用属性的`get`或者`set`的时候，属性委托的`getValue`和`setValue`就会被调用。

属性委托的结构如下：

```kotlin
class Delegate<T> : ReadWriteProperty<Any?, T> {
	fun getValue(thisRef: Any?, property: KProperty<*>): T {
		return ...
	}
	
	fun setValue(thisRef: Any?, property: KProperty<*>, value: T) {
		...
	}
}
```

这个T是委托属性的类型。`getValue`函数接收一个类的引用和一个属性的元数据。`setValue`函数又接收了一个被设置的值。如果这个属性是不可修改（val），就会只有一个`getValue`函数。

下面展示属性委托是怎么设置的：

```kotlin
class Example {
	var p: String by Delegate()
}
```

它使用了`by`这个关键字来指定一个委托对象。
# 标准委托

在Kotlin的标准库中有一系列的标准委托。它们包括了大部分有用的委托，但是我们也可以创建我们自己的委托。

#### Lazy

它包含一个lambda，当第一次执行`getValue`的时候这个lambda会被调用，所以这个属性可以被延迟初始化。之后的调用都只会返回同一个值。这是非常有趣的特性， 当我们在它们第一次真正调用之前不是必须需要它们的时候。我们可以节省内存，在这些属性真正需要前不进行初始化。

```kotlin
class App : Application() {
    val database: SQLiteOpenHelper by lazy {
		MyDatabaseHelper(applicationContext)
	}

	override fun onCreate() {
	    super.onCreate()
	    val db = database.writableDatabase
    }
}
```

在这个例子中，database并没有被真正初始化，直到第一次调用`onCreate`时。在那之后，我们才确保applicationContext存在，并且已经准备好可以被使用了。`lazy`操作符是线程安全的。

如果你不担心多线程问题或者想提高更多的性能，你也可以使用`lazy(LazyThreadSafeMode.NONE){ ... }`。


#### Observable

这个委托会帮我们监测我们希望观察的属性的变化。当被观察属性的`set`方法被调用的时候，它就会自动执行我们指定的lambda表达式。所以一旦该属性被赋了新的值，我们就会接收到被委托的属性、旧值和新值。

```kotlin
class ViewModel(val db: MyDatabase) {
	var myProperty by Delegates.observable("") {
	    d, old, new ->
	    db.saveChanges(this, new)
	}
}
```

这个例子展示了，一些我们需要关心的ViewMode，每次值被修改了，就会保存它们到数据库。


#### Vetoable

这是一个特殊的`observable`，它让你决定是否这个值需要被保存。它可以被用于在真正保存之前进行一些条件判断。

```kotlin
var positiveNumber = Delegates.vetoable(0) {
    d, old, new ->
	new >= 0
}
```

上面这个委托只允许在新的值是正数的时候执行保存。在lambda中，最后一行表示返回值。你不需要使用return关键字（实质上不能被编译）。

#### Not Null

有时候我们需要在某些地方初始化这个属性，但是我们不能在构造函数中确定，或者我们不能在构造函数中做任何事情。第二种情况在Android中很常见：在Activity、fragment、service、receivers……无论如何，一个非抽象的属性在构造函数执行完之前需要被赋值。为了给这些属性赋值，我们无法让它一直等待到我们希望给它赋值的时候。我们至少有两种选择方案。

第一种就是使用可null类型并且赋值为null，直到我们有了真正想赋的值。但是我们就需要在每个地方不管是否是null都要去检查。如果我们确定这个属性在任何我们使用的时候都不会是null，这可能会使得我们要编写一些必要的代码了。

第二种选择是使用`notNull`委托。它会含有一个可null的变量并会在我们设置这个属性的时候分配一个真实的值。如果这个值在被获取之前没有被分配，它就会抛出一个异常。

这个在单例App这个例子中很有用：

```kotlin
class App : Application() {
    companion object {
        var instance: App by Delegates.notNull()
	}
	
	override fun onCreate() {
        super.onCreate()
        instance = this
	}
}
```

#### 从Map中映射值

另外一种属性委托方式就是，属性的值会从一个map中获取value，属性的名字对应这个map中的key。这个委托可以让我们做一些很强大的事情，因为我们可以很简单地从一个动态地map中创建一个对象实例。如果我们import `kotlin.properties.getValue`，我们可以从构造函数映射到`val`属性来得到一个不可修改的map。如果我们想去修改map和属性，我们也可以import `kotlin.properties.setValue`。类需要一个`MutableMap`作为构造函数的参数。

想象我们从一个Json中加载了一个配置类，然后分配它们的key和value到一个map中。我们可以仅仅通过传入一个map的构造函数来创建一个实例：

```kotlin
import kotlin.properties.getValue

class Configuration(map: Map<String, Any?>) {
    val width: Int by map
    val height: Int by map
    val dp: Int by map
    val deviceName: String by map
}
```

作为一个参考，这里我展示下对于这个类怎么去创建一个必须要的map：

```kotlin
conf = Configuration(mapOf(
    "width" to 1080,
    "height" to 720,
    "dp" to 240,
    "deviceName" to "mydevice"
))
```
# 怎么去创建一个自定义的委托

先来说说我们要实现什么，举个例子，我们创建一个`notNull`的委托，它只能被赋值一次，如果第二次赋值，它就会抛异常。

Kotlin库提供了几个接口，我们自己的委托必须要实现：`ReadOnlyProperty`和`ReadWriteProperty`。具体取决于我们被委托的对象是`val`还是`var`。

我们要做的第一件事就是创建一个类然后继承`ReadWriteProperty`：

```kotlin
private class NotNullSingleValueVar<T>() : ReadWriteProperty<Any?, T> {

		override fun getValue(thisRef: Any?, property: KProperty<*>): T {
	        throw UnsupportedOperationException()
        }
           
		override fun setValue(thisRef: Any?, property: KProperty<*>, value: T) {
		}
}
```

这个委托可以作用在任何非null的类型。它接收任何类型的引用，然后像getter和setter那样使用T。现在我们需要去实现这些函数。

- Getter函数 如果已经被初始化，则会返回一个值，否则会抛异常。
- Setter函数 如果仍然是null，则赋值，否则会抛异常。

```kotlin
private class NotNullSingleValueVar<T>() : ReadWriteProperty<Any?, T> {
    private var value: T? = null
    override fun getValue(thisRef: Any?, property: KProperty<*>): T {
        return value ?: throw IllegalStateException("${desc.name} " +
                "not initialized")
	}
	
	override fun setValue(thisRef: Any?, property: KProperty<*>, value: T) {
		this.value = if (this.value == null) value
		else throw IllegalStateException("${desc.name} already initialized")
	}
}
```

现在你可以创建一个对象，然后添加函数使用你的委托：

```kotlin
object DelegatesExt {
    fun notNullSingleValue<T>():
            ReadWriteProperty<Any?, T> = NotNullSingleValueVar()
}
```
# 重新实现Application单例化

在这个情景下，委托就可以帮助我们了。我们直到我们的单例不会是null，但是我们不能使用构造函数去初始化属性。所以我们可以使用`notNull`委托：

```kotlin
class App : Application() {
    companion object {
        var instance: App by Delegates.notNull()
    }

	override fun onCreate() {
	        super.onCreate()
	        instance = this
	}
}
```

这种情况下有个问题，我们可以在app的任何地方去修改这个值，因为如果我们使用`Delegates.notNull()`，属性必须是var的。但是我们可以使用刚刚创建的委托，这样可以多一点保护。我们只能修改这个值一次：

```kotlin
companion object {
	var instance: App by DelegatesExt.notNullSingleValue()
}
```

尽管，在这个例子中，使用单例可能是最简单的方法，但是我想用代码的形式展示给你怎么去创建一个自定义的委托。
# 创建一个SQLiteOpenHelper

如你所知，Android使用SQLite作为它的数据库管理系统。SQLite是一个嵌入app的一个数据库，它的确是非常轻量的。这就是为什么这是手机app的不错的选择。

尽管如此，它的操作数据库的API在Android中是非常原生的。你将会需要编写很多SQL语句和你的对象与`ContentValues`或者`Cursors`之间的解析过程。很感激的，联合使用Kotlin和Anko，我们可以大量简化这些。

当然，有很多Android中可以使用的关于数据库的库，多亏Kotlin的互操作性，所有这些库都可以正常使用。但是针对一个简单的数据库来说可以不使用任何它们，之后的一分钟之内你就可以看到。


# ManagedSqliteOpenHelper

Anko提供了很多强大的SqliteOpenHelper来可以大量简化代码。当我们使用一个一般的`SqliteOpenHelper`，我们需要去调用`getReadableDatabase()`或者`getWritableDatabase()`，然后我们可以执行我们的搜索并拿到结果。在这之后，我们不能忘记调用`close()`。使用`ManagedSqliteOpenHelper`我们只需要：

```kotlin
forecastDbHelper.use {
	...
}
```

在lambda里面，我们可以直接使用`SqliteDatabase`中的函数。它是怎么工作的？阅读Anko函数的实现方式真是一件有趣的事情，你可以从这里学到Kotlin的很多知识：

```kotlin
public fun <T> use(f: SQLiteDatabase.() -> T): T {
    try {
	    return openDatabase().f()
	} finally {
	    closeDatabase()
    }
}
```

首先，`use`接收一个`SQLiteDatabase`的扩展函数。这表示，我们可以使用`this`在大括号中，并且处于`SQLiteDatabase`对象中。这个函数扩展可以返回一个值，所以我们可以像这么做：

```kotin
val result = forecastDbHelper.use {
    val queriedObject = ...
    queriedObject
}
```

要记住，在一个函数中，最后一行表示返回值。因为T没有任何的限制，所以我们可以返回任何对象。甚至如果我们不想返回任何值就使用`Unit`。

由于使用了`try-finall`，`use`方法会确保不管在数据库操作执行成功还是失败都会去关闭数据库。

而且，在`sqliteDatabase`中还有很多有用的扩展函数，我们会在之后使用到他们。但是现在让我们先定义我们的表和实现`SqliteOopenHelper`。
# 定义表

创建几个`objects`可以让我们避免表名列名拼写错误、重复等。我们需要两个表：一个用来保存城市的信息，另一个用来保存某天的天气预报。第二张表会有一个关联到第一张表的字段。

`CityForecastTable`提供了表的名字还有需要列：一个id（这个城市的zipCode），城市的名称和所在国家。

```kotlin
object CityForecastTable {
    val NAME = "CityForecast"
    val ID = "_id"
    val CITY = "city"
    val COUNTRY = "country"
}
```

`DayForecast`有更多的信息，就如你下面看到的有很多的列。最后一列`cityId`，用来保持属于的城市id。

```kotlin
object DayForecastTable {
	val NAME = "DayForecast"
	val ID = "_id"
	val DATE = "date"
	val DESCRIPTION = "description"
	val HIGH = "high"
	val LOW = "low"
	val ICON_URL = "iconUrl"
	val CITY_ID = "cityId"
}
```
# 实现SqliteOpenHelper

我们`SqliteOpenHelper`的基本组成是数据库的创建和更新，并提供了一个`SqliteDatebase`，使得我们可以用它来工作。查询可以被抽取出来放在其它的类中：

```kotlin
class ForecastDbHelper() : ManagedSQLiteOpenHelper(App.instance,
        ForecastDbHelper.DB_NAME, null, ForecastDbHelper.DB_VERSION) {
	...
}
```

我们在前面的章节中使用过我们创建的`App.instance`，这次我们同样的包括数据库名称和版本。这些值我们都会与`SqliteOpenHelper`一起定义在`companion object`中：

```kotlin
companion object {
    val DB_NAME = "forecast.db"
    val DB_VERSION = 1
    val instance: ForecastDbHelper by lazy { ForecastDbHelper() }
}
```

`instance`这个属性使用了`lazy`委托，它表示直到它真的被调用才会被创建。用这种方法，如果数据库从来没有被使用，我们没有必要去创建这个对象。一般`lazy`委托的代码块可以阻止在多个不同的线程中创建多个对象。这个只会发生在两个线程在同事时间访问这个`instance`对象，它很难发生但是发生具体还有看app的实现。无人如何，`lazy`委托是线程安全的。

为了去创建这些定义的表，我们需要去提供一个`onCreate`函数的实现。当没有库使用的时候，创建表会通过我们编写原生的包含我们定义好的列和类型的`CREATE TABLE`语句来实现。然而Anko提供了一个简单的扩展函数，它接收一个表的名字和一系列由列名和类型构建的`Pair`对象：

```kotlin
db.createTable(CityForecastTable.NAME, true,
        Pair(CityForecastTable.ID, INTEGER + PRIMARY_KEY),
        Pair(CityForecastTable.CITY, TEXT),
        Pair(CityForecastTable.COUNTRY, TEXT))
```

- 第一个参数是表的名称
- 第二个参数，当是true的时候，创建之前会检查这个表是否存在。
- 第三个参数是一个`Pair`类型的`vararg`参数。`vararg`也存在在Java中，这是一种在一个函数中传入联系很多相同类型的参数。这个函数也接收一个对象数组。

Anko中有一种叫做`SqlType`的特殊类型，它可以与`SqlTypeModifiers`混合，比如`PRIMARY_KEY`。`+`操作符像之前那样被重写了。这个`plus`函数会把两者通过合适的方式结合起来，然后返回一个新的`SqlType`：

```kotlin
fun SqlType.plus(m: SqlTypeModifier) : SqlType {
    return SqlTypeImpl(name, if (modifier == null) m.toString()
            else "$modifier $m")
}
```

如你所见，她会把多个修饰符组合起来。

但是回到我们的代码，我们可以修改得更好。Kotlin标准库中包含了一个叫`to`的函数，又一次，让我们来展示Kotlin的强大之处。它作为第一参数的扩展函数，接收另外一个对象作为参数，把两者组装并返回一个`Pair`。

```kotlin
public fun <A, B> A.to(that: B): Pair<A, B> = Pair(this, that)
```

因为带有一个函数参数的函数可以被用于inline，所以结果非常清晰：

```kotlin
val pair = object1 to object2
```

然后，把他们应用到表的创建中：

```kotlin
db.createTable(CityForecastTable.NAME, true,
        CityForecastTable.ID to INTEGER + PRIMARY_KEY,
        CityForecastTable.CITY to TEXT,
        CityForecastTable.COUNTRY to TEXT)
```

这就是整个函数看起来的样子：

```kotlin
override fun onCreate(db: SQLiteDatabase) {
    db.createTable(CityForecastTable.NAME, true,
            CityForecastTable.ID to INTEGER + PRIMARY_KEY,
            CityForecastTable.CITY to TEXT,
            CityForecastTable.COUNTRY to TEXT)
            
    db.createTable(DayForecastTable.NAME, true,
            DayForecastTable.ID to INTEGER + PRIMARY_KEY + AUTOINCREMENT,
            DayForecastTable.DATE to INTEGER,
            DayForecastTable.DESCRIPTION to TEXT,
            DayForecastTable.HIGH to INTEGER,
            DayForecastTable.LOW to INTEGER,
            DayForecastTable.ICON_URL to TEXT,
            DayForecastTable.CITY_ID to INTEGER)
}
```

我们有一个相似的函数用于删除表。`onUpgrade`将只是删除表，然后重建它们。我们只是把我们数据库作为一个缓存，所以这是一个简单安全的方法保证我们的表会如我们所期望的那样被重建。如果我有很重要的数据需要保留，我们就需要优化`onUpgrade`的代码，让它根据数据库版本来做相应的数据转移。

```kotlin
override fun onUpgrade(db: SQLiteDatabase, oldVersion: Int, newVersion: Int) {
    db.dropTable(CityForecastTable.NAME, true)
    db.dropTable(DayForecastTable.NAME, true)
    onCreate(db)
}
```
# 依赖注入

我试图不去增加很复杂的结构代码，保持简洁可测试性的代码和好的实践，我想我应该用Kotlin从其它方面去简化代码。如果你想了解一些控制反转或者依赖注入的话题，你可以查看我关于[Android中使用Dagger注入]的一系列文章。第一篇文章有关于他们这个团队的简单描写。

一种简单的方式，如果我们想拥有一些独立于其他类的类，这样更容易测试，并编写代码，易于扩展和维护，这时我们需要使用依赖注入。我们不去在类内部去实例化，我们在其它地方提供它们（通常通过构造函数）或者实例化它们。用这种方式，我们可以用其它的对象来替代他们。比如可以实现同样的接口或者在tests中使用mocks。

但是现在，这些依赖必须要在某些地方被提供，所以依赖注入由提供合作者的类组成。这些通常使用依赖注入器来完成。[Dagger]可能是Android上最流行的依赖注入器。当然当我们提供依赖有一定复杂性的时候是个很好的替代品。

但是最小的替代是可以在这个构造函数中使用默认值。我们可以给构造函数的参数通过分配默认值的方式提供一个依赖，然后在不同的情况下提供不同的实例。比如，在我们的`ForecastDbHelper`我们可以用更智能的方式提供一个context：

```kotlin
class ForecastDbHelper(ctx: Context = App.instance) :
        ManagedSQLiteOpenHelper(ctx, ForecastDbHelper.DB_NAME, null,
        ForecastDbHelper.DB_VERSION) {
        ...
}
```

现在我们有两种方式来创建这个类：

```kotlin
val dbHelper1 = ForecastDbHelper() // 它会使用 App.instance
val dbHelper2 = ForecastDbHelper(mockedContext) // 比如，提供给测试tests
```

我会到处使用这个特性，所以我在解释清楚之后再继续往下。我们已经有了表，所以是时候开始对它们增加和请求了。但是在这之前，我想先讲讲结合和函数操作符。别忘了查看代码库找到最新的代码。

[Android中使用Dagger注入]: http://http://antonioleiva.com/dependency-injection-android-dagger-part-1/
[Dagger]: http://square.github.io/dagger/
# 集合和函数操作符

在我们这个项目我们已经使用过集合了，但是现在是时候展示它们结合函数操作符之后有多强大了。关于函数式编程很不错的一点是我们不用去解释我们怎么去做，而是直接说我想做什么。比如，如果我想去过滤一个list，不用去创建一个list，遍历这个list的每一项，然后如果满足一定的条件则放到一个新的集合中，而是直接食用filer函数并指明我想用的过滤器。用这种方式，我们可以节省大量的代码。

虽然我们可以直接用Java中的集合，但是Kotlin也提供了一些你希望用的本地的接口：

- __Iterable__：父类。所有我们可以遍历一系列的都是实现这个接口。
- __MutableIterable__：一个支持遍历的同时可以执行删除的Iterables。
- __Collection__：这个类相是一个范性集合。我们通过函数访问可以返回集合的size、是否为空、是否包含一个或者一些item。这个集合的所有方法提供查询，因为connections是不可修改的。
- __MutableCollection__：一个支持增加和删除item的Collection。它提供了额外的函数，比如`add` 、`remove`、`clear`等等。
- __List__：可能是最流行的集合类型。它是一个范性有序的集合。因为它的有序，我们可以使用`get`函数通过position来访问。
- __MutableList__：一个支持增加和删除item的List。
- __Set__：一个无序并不支持重复item的集合。
- __MutableSet__：一个支持增加和删除item的Set。
- __Map__：一个key-value对的collection。key在map中是唯一的，也就是说不能有两对key是一样的键值对存在于一个map中。
- __MutableMap__：一个支持增加和删除item的map。

有很多不同集合可用的函数操作符。我想通过一个例子来展示给你看。知道有哪些可选的操作符是很有用的，因为这样会更容易分辨它们使用的时机。
# 总数操作符

#### any

如果至少有一个元素符合给出的判断条件，则返回true。

```kotlin
val list = listOf(1, 2, 3, 4, 5, 6)
assertTrue(list.any { it % 2 == 0 })
assertFalse(list.any { it > 10 })
```

#### all

如果全部的元素符合给出的判断条件，则返回true。

```kotlin
assertTrue(list.all { it < 10 })
assertFalse(list.all { it % 2 == 0 })
```

#### count

返回符合给出判断条件的元素总数。

```kotlin
assertEquals(3, list.count { it % 2 == 0 })
```

#### fold

在一个初始值的基础上从第一项到最后一项通过一个函数累计所有的元素。

```kotlin
assertEquals(25, list.fold(4) { total, next -> total + next })
```

#### foldRight

与`fold`一样，但是顺序是从最后一项到第一项。

```kotlin
assertEquals(25, list.foldRight(4) { total, next -> total + next })
```

#### forEach

遍历所有元素，并执行给定的操作。

```kotlin
list.forEach { println(it) }
```

#### forEachIndexed

与`forEach`，但是我们同时可以得到元素的index。

```kotlin
list.forEachIndexed { index, value
		-> println("position $index contains a $value") }
```

#### max

返回最大的一项，如果没有则返回null。

```kotlin
assertEquals(6, list.max())
```

#### maxBy

根据给定的函数返回最大的一项，如果没有则返回null。

```kotlin
// The element whose negative is greater
assertEquals(1, list.maxBy { -it })
```

#### min

返回最小的一项，如果没有则返回null。

```kotlin
assertEquals(1, list.min())
```

#### minBy

根据给定的函数返回最小的一项，如果没有则返回null。

```kotlin
// The element whose negative is smaller
assertEquals(6, list.minBy { -it })
```

#### none

如果没有任何元素与给定的函数匹配，则返回true。

```kotlin
// No elements are divisible by 7
assertTrue(list.none { it % 7 == 0 })
```

#### reduce

与`fold`一样，但是没有一个初始值。通过一个函数从第一项到最后一项进行累计。

```kotlin
assertEquals(21, list.reduce { total, next -> total + next })
```

#### reduceRight

与`reduce`一样，但是顺序是从最后一项到第一项。

```kotlin
assertEquals(21, list.reduceRight { total, next -> total + next })
```

#### sumBy

返回所有每一项通过函数转换之后的数据的总和。

```kotlin
assertEquals(3, list.sumBy { it % 2 })
```
# 过滤操作符

#### drop

返回包含去掉前n个元素的所有元素的列表。

```kotlin
assertEquals(listOf(5, 6), list.drop(4))
```

#### dropWhile

返回根据给定函数从第一项开始去掉指定元素的列表。

```kotin
assertEquals(listOf(3, 4, 5, 6), list.dropWhile { it < 3 })
```

#### dropLastWhile

返回根据给定函数从最后一项开始去掉指定元素的列表。

```kotlin
assertEquals(listOf(1, 2, 3, 4), list.dropLastWhile { it > 4 })
```

#### filter

过滤所有符合给定函数条件的元素。

```kotin
assertEquals(listOf(2, 4, 6), list .ilter { it % 2 == 0 })
```

#### filterNot

过滤所有不符合给定函数条件的元素。

```kotin
assertEquals(listOf(1, 3, 5), list.filterNot { it % 2 == 0 })
```

#### filterNotNull

过滤所有元素中不是null的元素。

```kotlin
assertEquals(listOf(1, 2, 3, 4), listWithNull.filterNotNull())
```

#### slice

过滤一个list中指定index的元素。

```kotlin
assertEquals(listOf(2, 4, 5), list.slice(listOf(1, 3, 4)))
```

#### take

返回从第一个开始的n个元素。

```kotlin
assertEquals(listOf(1, 2), list.take(2))
```

#### takeLast

返回从最后一个开始的n个元素

```kotlin
assertEquals(listOf(5, 6), list.takeLast(2))
```

#### takeWhile

返回从第一个开始符合给定函数条件的元素。

```kotlin
assertEquals(listOf(1, 2), list.takeWhile { it < 3 })
```
# 映射操作符

#### flatMap

遍历所有的元素，为每一个创建一个集合，最后把所有的集合放在一个集合中。

```kotlin
assertEquals(listOf(1, 2, 2, 3, 3, 4, 4, 5, 5, 6, 6, 7), 
list.flatMap { listOf(it, it + 1) })
```

#### groupBy

返回一个根据给定函数分组后的map。

```kotlin
assertEquals(mapOf("odd" to listOf(1, 3, 5), "even" to listOf(2, 4, 6)), list.groupBy { if (it % 2 == 0) "even" else "odd" })
```

#### map

返回一个每一个元素根据给定的函数转换所组成的List。

```kotlin
assertEquals(listOf(2, 4, 6, 8, 10, 12), list.map { it * 2 })
```

#### mapIndexed

返回一个每一个元素根据给定的包含元素index的函数转换所组成的List。

```kotlin
assertEquals(listOf (0, 2, 6, 12, 20, 30), list.mapIndexed { index, it -> index * it })
```

#### mapNotNull

返回一个每一个非null元素根据给定的函数转换所组成的List。

```kotlin
assertEquals(listOf(2, 4, 6, 8), listWithNull.mapNotNull { it * 2 })
```
# 元素操作符

#### contains

如果指定元素可以在集合中找到，则返回true。

```kotlin
assertTrue(list.contains(2))
```

#### elementAt

返回给定index对应的元素，如果index数组越界则会抛出`IndexOutOfBoundsException`。

```kotlin
assertEquals(2, list.elementAt(1))
```

#### elementAtOrElse

返回给定index对应的元素，如果index数组越界则会根据给定函数返回默认值。

```kotlin
assertEquals(20, list.elementAtOrElse(10, { 2 * it }))
```

#### elementAtOrNull

返回给定index对应的元素，如果index数组越界则会返回null。

```kotlin
assertNull(list.elementAtOrNull(10))
```

#### first

返回符合给定函数条件的第一个元素。

```kotlin
assertEquals(2, list.first { it % 2 == 0 })
```

#### firstOrNull

返回符合给定函数条件的第一个元素，如果没有符合则返回null。

```kotlin
assertNull(list.firstOrNull { it % 7 == 0 })
```

#### indexOf

返回指定元素的第一个index，如果不存在，则返回`-1`。

```kotlin
assertEquals(3, list.indexOf(4))
```

#### indexOfFirst

返回第一个符合给定函数条件的元素的index，如果没有符合则返回`-1`。

```kotlin
assertEquals(1, list.indexOfFirst { it % 2 == 0 })
```

#### indexOfLast

返回最后一个符合给定函数条件的元素的index，如果没有符合则返回`-1`。

```kotlin
assertEquals(5, list.indexOfLast { it % 2 == 0 })
```

#### last

返回符合给定函数条件的最后一个元素。

```kotlin
assertEquals(6, list.last { it % 2 == 0 })
```

#### lastIndexOf

返回指定元素的最后一个index，如果不存在，则返回`-1`。

#### lastOrNull

返回符合给定函数条件的最后一个元素，如果没有符合则返回null。

```kotlin
val list = listOf(1, 2, 3, 4, 5, 6)
assertNull(list.lastOrNull { it % 7 == 0 })
```

#### single

返回符合给定函数的单个元素，如果没有符合或者超过一个，则抛出异常。

```kotlin
assertEquals(5, list.single { it % 5 == 0 })
```

#### singleOrNull

返回符合给定函数的单个元素，如果没有符合或者超过一个，则返回null。

```kotlin
assertNull(list.singleOrNull { it % 7 == 0 })
```
# 生产操作符

#### merge

把两个集合合并成一个新的，相同index的元素通过给定的函数进行合并成新的元素作为新的集合的一个元素，返回这个新的集合。新的集合的大小由最小的那个集合大小决定。

```kotlin
val list = listOf(1, 2, 3, 4, 5, 6)
val listRepeated = listOf(2, 2, 3, 4, 5, 5, 6)
assertEquals(listOf(3, 4, 6, 8, 10, 11), list.merge(listRepeated) { it1, it2 -> it1 + it2 })
```

#### partition

把一个给定的集合分割成两个，第一个集合是由原集合每一项元素匹配给定函数条件返回`true`的元素组成，第二个集合是由原集合每一项元素匹配给定函数条件返回`false`的元素组成。

```kotlin
assertEquals(
	Pair(listOf(2, 4, 6), listOf(1, 3, 5)), 
	list.partition { it % 2 == 0 }
)
```

#### plus

返回一个包含原集合和给定集合中所有元素的集合，因为函数的名字原因，我们可以使用`+`操作符。

```kotlin
assertEquals(
	listOf(1, 2, 3, 4, 5, 6, 7, 8), 
	list + listOf(7, 8)
)
```

#### zip

返回由`pair`组成的List，每个`pair`由两个集合中相同index的元素组成。这个返回的List的大小由最小的那个集合决定。

```kotin
assertEquals(
	listOf(Pair(1, 7), Pair(2, 8)), 
	list.zip(listOf(7, 8))
)
```

#### unzip

从包含pair的List中生成包含List的Pair。

```kotlin
assertEquals(
	Pair(listOf(5, 6), listOf(7, 8)), 
	listOf(Pair(5, 7), Pair(6, 8)).unzip()
)
```
# 顺序操作符

#### reverse

返回一个与指定list相反顺序的list。

```kotlin
val unsortedList = listOf(3, 2, 7, 5)
assertEquals(listOf(5, 7, 2, 3), unsortedList.reverse())
```

#### sort

返回一个自然排序后的list。

```kotlin
assertEquals(listOf(2, 3, 5, 7), unsortedList.sort())
```

#### sortBy

返回一个根据指定函数排序后的list。

```kotlin
assertEquals(listOf(3, 7, 2, 5), unsortedList.sortBy { it % 3 })
```

#### sortDescending

返回一个降序排序后的List。

```kotlin
assertEquals(listOf(7, 5, 3, 2), unsortedList.sortDescending())
```

#### sortDescendingBy

返回一个根据指定函数降序排序后的list。

```kotlin
assertEquals(listOf(2, 5, 7, 3), unsortedList.sortDescendingBy { it % 3 })
```





