package com.jchun.mylauncher.widget;

import android.content.Intent;
import android.os.AsyncTask;
import android.widget.Toast;

import com.jchun.mylauncher.activity.MainActivity;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Created by Administrator on 17-9-30.
 */

public class ControllerImp implements Controller{

        @Override
        public void initData(final List<ApplicationInfo> list) {
            AsyncTask<String, String, String> tast = new AsyncTask<String, String, String>() {

                @Override
                protected String doInBackground(String... params) {
//                    List<ApplicationInfo> child = new ArrayList<ApplicationInfo>();
                    for (int i = 0; i < 8; i++) {
                        ApplicationInfo info = new ApplicationInfo();
                        info.setId(i + "");
                        info.setTitle("应用" + i);
                        info.setOrder(i);
                        if (i == 0) {
                            info.setImgUrl("http://img3.imgtn.bdimg.com/it/u=568867752,3099839373&fm=21&gp=0.jpg");
                        } else if (i == 1) {
                            info.setImgUrl("http://a2.att.hudong.com/04/58/300001054794129041580438110_950.jpg");
                        } else if (i == 2) {
                            info.setImgUrl("http://img.sc115.com/uploads/sc/jpgs/11/pic1916_sc115.com.jpg");
                        } else if (i == 3) {
                            info.setImgUrl("http://pic12.nipic.com/20110222/6660820_111945190101_2.jpg");
                        } else if (i == 4) {
                            info.setImgUrl("http://pica.nipic.com/2007-12-26/2007122602930235_2.jpg");
                        } else if (i == 5) {
                            info.setImgUrl("http://pic9.nipic.com/20100902/5615113_084913055054_2.jpg");
                        } else if (i == 6) {
                            info.setImgUrl("http://pica.nipic.com/2008-01-03/200813165855102_2.jpg");
                        } else if (i == 7) {
                            info.setImgUrl("http://pica.nipic.com/2008-03-20/2008320152335853_2.jpg");
                        } else {
                            //                            info.setIcon(BitmapFactory.decodeResource(getResources(), R.drawable.logo));
                            info.setImgUrl("http://pic2.ooopic.com/01/26/61/83bOOOPIC72.jpg");
                        }
                        //                        info.setIcon(BitmapFactory.decodeResource(getResources(), R.drawable.logo));
                        list.add(info);
                    }
                    //                    for (int i = 0; i < 13; i++) {
                    //                        ApplicationInfo info = new ApplicationInfo();
                    //                        info.setId(i + "aa");
                    //                        info.setTitle("应用" + i);
                    //                        info.setId(i + "");
                    //                        info.setOrder(i);
                    //                        if (i == 0) {
                    //                            info.setIcon(BitmapFactory.decodeResource(getResources(), R.drawable.a1));
                    //                        } else if (i == 1) {
                    //                            info.setIcon(BitmapFactory.decodeResource(getResources(), R.drawable.a2));
                    //                        } else if (i == 2) {
                    //                            info.setIcon(BitmapFactory.decodeResource(getResources(), R.drawable.a3));
                    //                        } else if (i == 3) {
                    //                            info.setIcon(BitmapFactory.decodeResource(getResources(), R.drawable.a4));
                    //                        } else if (i == 4) {
                    //                            info.setIcon(BitmapFactory.decodeResource(getResources(), R.drawable.a5));
                    //                        } else if (i == 5) {
                    //                            info.setIcon(BitmapFactory.decodeResource(getResources(), R.drawable.a6));
                    //                        } else if (i == 6) {
                    //                            info.setIcon(BitmapFactory.decodeResource(getResources(), R.drawable.a7));
                    //                        } else if (i == 7) {
                    //                            info.setIcon(BitmapFactory.decodeResource(getResources(), R.drawable.a8));
                    //                        } else {
                    //                            //                            info.setIcon(BitmapFactory.decodeResource(getResources(), R.drawable.logo));
                    //                            info.setImgUrl("http://img3.imgtn.bdimg.com/it/u=568867752,3099839373&fm=21&gp=0.jpg");
                    //                        }
                    //                        child.add(info);
                    //                    }
                    //                    FolderInfo folder = new FolderInfo();
                    //                    folder.setId(25 + "");
                    //                    folder.setIcons(child);
                    //                    folder.setOrder(25);
                    //                    folder.setTitle("文件夹");
                    //                    list.add(folder);
                    Collections.sort(list, new Comparator<ApplicationInfo>() {
                        public int compare(ApplicationInfo arg0, ApplicationInfo arg1) {
                            return arg0.getOrder() - arg1.getOrder();
                        }
                    });
                    return null;
                }

                protected void onPostExecute(String result) {
//                    loaded();
                }
            };
            tast.execute("");
        }

        @Override
        public void onSynchronize() {
//            Toast.makeText(MainActivity.this, "正在同步数据", Toast.LENGTH_SHORT).show();
        }

        @Override
        public void onAppClick(ApplicationInfo app) {
//            Toast.makeText(MainActivity.this, "点击了" + app.getTitle(), Toast.LENGTH_SHORT).show();

        }

        @Override
        public void onAppRemove(ApplicationInfo app) {
//            Toast.makeText(MainActivity.this, "删除" + app.getTitle(), Toast.LENGTH_SHORT).show();
//            Intent intent = new Intent(RECEIVER_ADD_APP);
//            sendBroadcast(intent);
        }
}
