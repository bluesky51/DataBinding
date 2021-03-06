# DataBinding
DataBinding的基本使用以及结合本地和网络数据进行数据绑定(DataBinding＋Retrofit+ListView/RecyclerView)

DataBinding优势：   
1.不用findViewById()   
2.将数据分解到各个view  
3.在UI线程上更新数据  
4.监控数据的变化，实时更新  
1.配置：  
打开Module下的build.gradle文件，在android标签中添加如下话语：  

    dataBinding{
        enabled true//表示启动dateBinding功能
     }
2.入门用法：  
    1》布局文件以layout为根标签，基本结构如下:  
   《1》单个对象传递：  
             例如：  
             
             <data>
                  <variable
                       name="对象名"
                       type="对象所在类的具体位置">
                  </variable>
             </data>
      给控件赋值引用值：@{对象名.变量名}
  《2》多个对象使用集合传递：  
   例如： 
   
            <data>
                <import type="对象所在类的具体位置"></import>
                <variable
                    name="对象所在集合的名称"
                    type="java.util.List&lt;类&gt;">xml文件中< >符合需要转义字符，转义的字符后续具体说明
                </variable>
            </data>
            
   备注：
     
     /**
       *以下是XML中需要的转义字符:[/size]
       * &(逻辑与)  &amp;       
       * <(小于)    &lt;       
       * >(大于)    &gt;       
       * "(双引号)  &quot;     
       * '(单引号)  &apos; [/size]
       */
   《3》ListView或者GridView的data模型示例如下：  
   
           <data>
               <variable
                name="adapter"
                type="android.widget.BaseAdapter"></variable>
           </data>
ListView在布局中写法如下：
             
              <ListView
                      android:layout_width="match_parent"
                      android:layout_height="wrap_content"
                      app:adapter="@{ adapter }">
              </ListView>
RecyclerView的data模型示例如下
            
            <data>
                <variable
                   name="adapter"
                   type="android.support.v7.widget.RecyclerView.Adapter"></variable>
            </data>
RecyclerView在布局中写法如下：
           
           <android.support.v7.widget.RecyclerView
                android:layout_width="match_parent"
                android:layout_height="match_parent"
                app:layoutManager="LinearLayoutManager"
                app:adapter="@{ adapter }"
                >
           </android.support.v7.widget.RecyclerView>
完整结构示意如下： 
 
    <?xml version="1.0" encoding="utf-8"?>
    <layout xmlns:app="http://schemas.android.com/apk/res-auto">
      <!--填充数据的对象以及引入路径-->
      <data>
      <!--引入变量的具体位置：包名＋类名-->
        <import type="....."></import>
        <variable
            name="......"  <!--填充数据的对象名-->
            type="....">  <!--填充数据的对象具体路径路径-->
        </variable>
    </data>
    <LinearLayout ....>
       <TextView..../>
       <Button..../>
       <!--控件内容填充格式如右:@{对象名.变量名}-->
    </LinearLayout>
    </layout>
  
《4》单个控件的点击事件setOnClickListener/setOnLongClickListener如下说明：  
指定对象的点击方法在对于的实体类中声明，其中参数和返回值需和指定的监听事件类型一致；    
在xml指定控件的调用如：  
android:onClick="@{对象名.方法名}"    
android:onLongClick="{对象名.方法名}"     

 2》java代码中布局加载改为：  
 DataBindingUtil调用setContentView加载布局返回视图数据绑定的对象  
ActivityMainBinding activityMainBinding =
   DataBindingUtil.setContentView(this,R.layout.activity_main);
                   
      activityMainBinding.set对象(List集合或者单个对象);
      备注：ActivityMainBinding是ViewDataBinding类的子类，该对象持有Activity要展示的数据和布局中的各个view的引用
3》加载网络图片：  
思路：由于图片设置的内容都是drawable类型，但网络图片是一个字符串地址，
    所以布局文件中使用自定义属性设置，具体操作如下：    
 1.书写加载图片的工具类，具体如下：  
 备注:ImageView已经和model的url绑定了，比如说：请求接口时，当请求完成时，拿到所需的图片url,通过model.setXX("图片地址")，这时ImageView上的图片就会自动变化。  
 
      @BindingAdapter({"imageUrl"})
        public  static void loadImage(ImageView imageView,String url){
           if (url==null){
            imageView.setImageResource(R.mipmap.ic_launcher);
           }else{
               Glide.with(imageView.getContext()).load(url)
                       .placeholder(R.mipmap.ic_launcher)
                       .into(imageView);
           }
        }
        
BindingAdapter的含义：  
1、它是一个注解关键词；  
2、他是用来标记的方法的；  
3、它的功能是用来设置view的属性值。它修饰的方法必须用public static 修饰   

4》加载网络数据完成ListView效果：  
具体看CommnAdapter:设置数据viewDataBinding的实现类setAdapter    
5》加载网络数据完成RecyclerView效果：   
具体看RecyclerCommonAdapter:设置数据viewDataBinding的实现类setAdapter
