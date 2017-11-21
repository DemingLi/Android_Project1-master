package com.example.lixiang.threekingdoms;

public class CharacterInfo {
    private String name;
    private String sex;
    private String date;
    private String origin;
    private String force;
    private int resId;
    private int card_img_id;
    private String letters;
    public CharacterInfo(String name, String sex, String date, String origin, String allegiance_force){
        this.name = name;
        this.sex = sex;
        this.date = date;
        this.origin = origin;
        this.force = allegiance_force;
        switch (name){
            case "蔡琰":
                resId = R.drawable.avatar_caiyan;
                card_img_id = R.drawable.caiyan;
                break;
            case "曹操":
                resId = R.drawable.avatar_caocao;
                card_img_id = R.drawable.caocao;
                break;
            case "大乔":
                resId = R.drawable.avatar_daqiao;
                card_img_id = R.drawable.daqiao;
                break;
            case "典韦":
                resId = R.drawable.avatar_dianwei;
                card_img_id = R.drawable.dianwei;
                break;
            case "貂蝉":
                resId = R.drawable.avatar_diaochan;
                card_img_id = R.drawable.diaochan;
                break;
            case "关羽":
                resId = R.drawable.avatar_guanyu;
                card_img_id = R.drawable.guanyu;
                break;
            case "刘备":
                resId = R.drawable.avatar_liubei;
                card_img_id = R.drawable.liubei;
                break;
            case "吕布":
                resId = R.drawable.avatar_lvbu;
                card_img_id = R.drawable.lvbu;
                break;
            case "司马懿":
                resId = R.drawable.avatar_simayi;
                card_img_id = R.drawable.simayi;
                break;
            case "孙策":
                resId = R.drawable.avatar_sunce;
                card_img_id = R.drawable.sunce;
                break;
            case "孙权":
                resId = R.drawable.avatar_sunquan;
                card_img_id = R.drawable.sunquan;
                break;
            case "孙尚香":
                resId = R.drawable.avatar_sunshangxiang;
                card_img_id = R.drawable.sunshangxiang;
                break;
            case "文昭皇后":
                resId = R.drawable.avatar_wenzhaohuanghou;
                card_img_id = R.drawable.wenzhaohuanghou;
                break;
            case "张飞":
                resId = R.drawable.avatar_zhangfei;
                card_img_id = R.drawable.zhangfei;
                break;
            case "周瑜":
                resId = R.drawable.avatar_zhouyu;
                card_img_id = R.drawable.zhouyu;
                break;
            case "诸葛亮":
                resId = R.drawable.avatar_zhugeliang;
                card_img_id = R.drawable.zhugeliang;
                break;
            default:
                switch (sex) {
                    case "男":
                        resId = R.drawable.avatar_nan;
                        break;
                    case "女":
                        resId = R.drawable.avatar_nv;
                        break;
                }
                break;
        }
        String pinyin = PinyinUtils.getPingYin(name);
        String sortString = pinyin.substring(0, 1).toUpperCase();
        // 正则表达式，判断首字母是否是英文字母
        if (sortString.matches("[A-Z]")) {
            this.letters = sortString.toUpperCase();
        }
        else {
            this.letters = "#";
        }
    }
    public String getName(){
        return name;
    }
    public String getSex(){
        return sex;
    }
    public String getDate(){
        return date;
    }
    public String getOrigin(){
        return origin;
    }
    public String getForce(){
        return force;
    }
    public int getResId(){
        return resId;
    }
    public int getCard_img_id() {
        return card_img_id;
    }
    
    public void setResId(int resId) {
        this.resId = resId;
    }
    public String getLetters() {
        return letters;
    }
    public void setLetters(String letters) {
        this.letters = letters;
    }

}
