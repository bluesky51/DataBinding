package com.sky.databinding.bean;

import android.content.Context;
import android.content.Intent;
import android.view.View;

import com.sky.databinding.activity.RecyclerViewDetailActivity;

import java.util.List;

/**
 * Created by bluesky on 16/11/2.
 */

public class Essay {

    /**
     * msg : OK
     * data : [{"published_at":1461586357,"url":"http://www.menghuoapp.com/post/402","favorite_num":22,"post_id":402,"repost_num":861,"subtitle":"","pic_url":"http://7xiuft.com1.z0.glb.clouddn.com/20160425/b68be2d497f3576faa5590231caab8d4.jpg","favorite":0,"title":"wuli萌货来啦！"},{"published_at":1453219200,"url":"http://www.menghuoapp.com/post/401","favorite_num":51,"post_id":401,"repost_num":2088,"subtitle":"萌货app搬家公告","pic_url":"http://7xiuft.com1.z0.glb.clouddn.com/20160119/15a9f0709eae8405ad4608928c4e6e3e.png","favorite":0,"title":"阿萌搬家啦~"},{"published_at":1453206600,"url":"http://www.menghuoapp.com/post/396","favorite_num":76,"post_id":396,"repost_num":1053,"subtitle":"猫咪主题杯子","pic_url":"http://7xiuft.com1.z0.glb.clouddn.com/20160108/ecc58fcfc24f3604a4d426574f129687.jpg","favorite":0,"title":"喵星人杯具萌萌哒~"},{"published_at":1453120200,"url":"http://www.menghuoapp.com/post/397","favorite_num":78,"post_id":397,"repost_num":799,"subtitle":"抹茶味零食","pic_url":"http://7xiuft.com1.z0.glb.clouddn.com/20160108/9c90de3b9d1c57bea227ea322ca1cd4d.jpg","favorite":0,"title":"让抹茶系治愈躁动不安的你"},{"published_at":1453033800,"url":"http://www.menghuoapp.com/post/399","favorite_num":26,"post_id":399,"repost_num":358,"subtitle":"姆明亚美周边精选","pic_url":"http://7xiuft.com1.z0.glb.clouddn.com/20160112/02b80639d6f4f6b19fec5083266be7b9.jpg","favorite":0,"title":"姆明一族万岁！"},{"published_at":1452947400,"url":"http://www.menghuoapp.com/post/398","favorite_num":32,"post_id":398,"repost_num":280,"subtitle":"太子妃升职记同款口红特辑","pic_url":"http://7xiuft.com1.z0.glb.clouddn.com/20160109/6304d63a0e6cdd7560396ce14ade4ce6.jpg","favorite":0,"title":"跟着\u201c太子妃\u201d选口红！"},{"published_at":1452861000,"url":"http://www.menghuoapp.com/post/400","favorite_num":74,"post_id":400,"repost_num":344,"subtitle":"玻璃罐收纳特辑","pic_url":"http://7xiuft.com1.z0.glb.clouddn.com/20160114/c1f2babec34c52ebc909cf7c6163cf13.jpg","favorite":0,"title":"把美好装满瓶瓶罐罐"},{"published_at":1452774600,"url":"http://www.menghuoapp.com/post/395","favorite_num":15,"post_id":395,"repost_num":224,"subtitle":"新年红转运特辑","pic_url":"http://7xiuft.com1.z0.glb.clouddn.com/20160107/d146f835a878e0bb22494a4be8b5ca16.jpg","favorite":0,"title":"猴年开运大法"},{"published_at":1452688200,"url":"http://www.menghuoapp.com/post/394","favorite_num":56,"post_id":394,"repost_num":293,"subtitle":"唯美勺子特辑","pic_url":"http://7xiuft.com1.z0.glb.clouddn.com/20160107/0351490adf5a8935acccfd366b2b848b.jpg","favorite":0,"title":"小公主的小勺子"},{"published_at":1452601800,"url":"http://www.menghuoapp.com/post/393","favorite_num":47,"post_id":393,"repost_num":260,"subtitle":"白菜价萌包推荐","pic_url":"http://7xiuft.com1.z0.glb.clouddn.com/20160106/487f39072400bf090c903eb6fdf79ff3.jpg","favorite":0,"title":"没钱，也要买包包！"},{"published_at":1452515400,"url":"http://www.menghuoapp.com/post/392","favorite_num":49,"post_id":392,"repost_num":263,"subtitle":"可爱茶壶精选","pic_url":"http://7xiuft.com1.z0.glb.clouddn.com/20160106/7b0d660067dcbfdd9cf22b77f6d99009.jpg","favorite":0,"title":"喝白开水也要甜甜的！"},{"published_at":1452429000,"url":"http://www.menghuoapp.com/post/391","favorite_num":30,"post_id":391,"repost_num":260,"subtitle":"超萌企鹅小物推荐","pic_url":"http://7xiuft.com1.z0.glb.clouddn.com/20160105/397ee0be8ca6955481c9eb1dca34dae6.jpg","favorite":0,"title":"我们才不胖，我们只是圆！"},{"published_at":1452342600,"url":"http://www.menghuoapp.com/post/390","favorite_num":54,"post_id":390,"repost_num":234,"subtitle":"人气巧克力推荐","pic_url":"http://7xiuft.com1.z0.glb.clouddn.com/20160105/5ca8b427609a9c53f843269b9f24f82c.jpg","favorite":0,"title":"甜蜜的诱惑"},{"published_at":1452256200,"url":"http://www.menghuoapp.com/post/389","favorite_num":28,"post_id":389,"repost_num":225,"subtitle":"豆沙色热门口红攻略","pic_url":"http://7xiuft.com1.z0.glb.clouddn.com/20160104/17c7cbfbf2c8ffbe7a8f9f73710562a5.jpg","favorite":0,"title":"豆沙色爱心攻击！"},{"published_at":1452169800,"url":"http://www.menghuoapp.com/post/386","favorite_num":34,"post_id":386,"repost_num":207,"subtitle":"创意相框推荐","pic_url":"http://7xiuft.com1.z0.glb.clouddn.com/20151230/9224a8e68550069b6f72014c8b6f790b.jpg","favorite":0,"title":"框住回忆框住幸福"},{"published_at":1452083400,"url":"http://www.menghuoapp.com/post/385","favorite_num":23,"post_id":385,"repost_num":215,"subtitle":"不二家周边大搜罗","pic_url":"http://7xiuft.com1.z0.glb.clouddn.com/20151230/cb95703a888a9fdb3e14b7840fca3377.jpg","favorite":0,"title":"牛奶妹！不只是甜甜哒~"},{"published_at":1451997000,"url":"http://www.menghuoapp.com/post/388","favorite_num":43,"post_id":388,"repost_num":212,"subtitle":"3M好玩小物大推荐","pic_url":"http://7xiuft.com1.z0.glb.clouddn.com/20151231/9d4a1a26828facbbba04e557f547b8fe.jpg","favorite":0,"title":"意想不到的3M产品"},{"published_at":1451910600,"url":"http://www.menghuoapp.com/post/387","favorite_num":43,"post_id":387,"repost_num":228,"subtitle":"造型发带推荐","pic_url":"http://7xiuft.com1.z0.glb.clouddn.com/20151231/c41f76b30518d624a645854c867c1bbd.jpg","favorite":0,"title":"解救沉闷造型"},{"published_at":1451824200,"url":"http://www.menghuoapp.com/post/384","favorite_num":22,"post_id":384,"repost_num":203,"subtitle":"高人气口碑眼影组推荐","pic_url":"http://7xiuft.com1.z0.glb.clouddn.com/20151229/b404abfa64e3da0b0d5ce50f913031df.jpg","favorite":0,"title":"玩转眼妆就是它！"},{"published_at":1451737800,"url":"http://www.menghuoapp.com/post/383","favorite_num":26,"post_id":383,"repost_num":241,"subtitle":"速溶咖啡特辑","pic_url":"http://7xiuft.com1.z0.glb.clouddn.com/20151224/8df85326dfdeacc5d7f6fbd38568b323.jpg","favorite":0,"title":"等一人咖啡"}]
     * code : 0
     */

    private String msg;
    private int code;
    /**
     * published_at : 1461586357
     * url : http://www.menghuoapp.com/post/402
     * favorite_num : 22
     * post_id : 402
     * repost_num : 861
     * subtitle :
     * pic_url : http://7xiuft.com1.z0.glb.clouddn.com/20160425/b68be2d497f3576faa5590231caab8d4.jpg
     * favorite : 0
     * title : wuli萌货来啦！
     */

    private List<DataBean> data;

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public List<DataBean> getData() {
        return data;
    }

    public void setData(List<DataBean> data) {
        this.data = data;
    }

    public static class DataBean {
        private int published_at;
        private String url;
        private int favorite_num;
        private int post_id;
        private int repost_num;
        private String subtitle;
        private String pic_url;
        private int favorite;
        private String title;

        public int getPublished_at() {
            return published_at;
        }

        public void setPublished_at(int published_at) {
            this.published_at = published_at;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public int getFavorite_num() {
            return favorite_num;
        }

        public void setFavorite_num(int favorite_num) {
            this.favorite_num = favorite_num;
        }

        public int getPost_id() {
            return post_id;
        }

        public void setPost_id(int post_id) {
            this.post_id = post_id;
        }

        public int getRepost_num() {
            return repost_num;
        }

        public void setRepost_num(int repost_num) {
            this.repost_num = repost_num;
        }

        public String getSubtitle() {
            return subtitle;
        }

        public void setSubtitle(String subtitle) {
            this.subtitle = subtitle;
        }

        public String getPic_url() {
            return pic_url;
        }

        public void setPic_url(String pic_url) {
            this.pic_url = pic_url;
        }

        public int getFavorite() {
            return favorite;
        }

        public void setFavorite(int favorite) {
            this.favorite = favorite;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public void itemClick(View view) {
            Context context = view.getContext();
            Intent intent = new Intent(context, RecyclerViewDetailActivity.class);
            intent.putExtra("url",url);
            context.startActivity(intent);

        }
    }



}
