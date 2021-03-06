/*
 * {EasyGank}  Copyright (C) {2015}  {CaMnter}
 *
 * This program comes with ABSOLUTELY NO WARRANTY; for details type `show w'.
 * This is free software, and you are welcome to redistribute it
 * under certain conditions; type `show c' for details.
 *
 * The hypothetical commands `show w' and `show c' should show the appropriate
 * parts of the General Public License.  Of course, your program's commands
 * might be different; for a GUI interface, you would use an "about box".
 *
 * You should also get your employer (if you work as a programmer) or school,
 * if any, to sign a "copyright disclaimer" for the program, if necessary.
 * For more information on this, and how to apply and follow the GNU GPL, see
 * <http://www.gnu.org/licenses/>.
 *
 * The GNU General Public License does not permit incorporating your program
 * into proprietary programs.  If your program is a subroutine library, you
 * may consider it more useful to permit linking proprietary applications with
 * the library.  If this is what you want to do, use the GNU Lesser General
 * Public License instead of this License.  But first, please read
 * <http://www.gnu.org/philosophy/why-not-lgpl.html>.
 */

package com.chengzj.app.data.entity;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * Description：GankDaily  ( 每日数据 )
 * Created by：CaMnter
 * Time：2016-01-03 17:44
 */
public class GankDaily extends Error implements Serializable {

    @SerializedName("results") public DailyResults results;

    @SerializedName("category") public ArrayList<String> category;

    public class DailyResults {

        @SerializedName("福利") public ArrayList<BaseGankData> welfareData;

        @SerializedName("Android") public ArrayList<BaseGankData> androidData;

        @SerializedName("iOS") public ArrayList<BaseGankData> iosData;

        @SerializedName("前端") public ArrayList<BaseGankData> jsData;

        @SerializedName("休息视频") public ArrayList<BaseGankData> videoData;

        @SerializedName("拓展资源") public ArrayList<BaseGankData> resourcesData;

        @SerializedName("App") public ArrayList<BaseGankData> appData;

        @SerializedName("瞎推荐") public ArrayList<BaseGankData> recommendData;
    }
}
