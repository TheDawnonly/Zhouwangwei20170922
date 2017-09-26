package bawei.com.zhouwangwei20170926;

import java.util.List;

/**
 * Created by Mr.周 on 2017/9/26.
 */

public class Beans {

    /**
     * error_code : 200
     * reason : 请求成功！
     * result : {"comicName":"辛巴达的冒险","chapterId":237401,"imageList":[{"imageUrl":"http://imgs.juheapi.com/comic_xin/0MGwzbTvtcTDsM/V/237401/0-MjM3NDAxMA==.jpg","id":1},{"imageUrl":"http://imgs.juheapi.com/comic_xin/0MGwzbTvtcTDsM/V/237401/1-MjM3NDAxMQ==.jpg","id":2},{"imageUrl":"http://imgs.juheapi.com/comic_xin/0MGwzbTvtcTDsM/V/237401/2-MjM3NDAxMg==.jpg","id":3},{"imageUrl":"http://imgs.juheapi.com/comic_xin/0MGwzbTvtcTDsM/V/237401/3-MjM3NDAxMw==.jpg","id":4},{"imageUrl":"http://imgs.juheapi.com/comic_xin/0MGwzbTvtcTDsM/V/237401/4-MjM3NDAxNA==.jpg","id":5},{"imageUrl":"http://imgs.juheapi.com/comic_xin/0MGwzbTvtcTDsM/V/237401/5-MjM3NDAxNQ==.jpg","id":6},{"imageUrl":"http://imgs.juheapi.com/comic_xin/0MGwzbTvtcTDsM/V/237401/6-MjM3NDAxNg==.jpg","id":7},{"imageUrl":"http://imgs.juheapi.com/comic_xin/0MGwzbTvtcTDsM/V/237401/7-MjM3NDAxNw==.jpg","id":8},{"imageUrl":"http://imgs.juheapi.com/comic_xin/0MGwzbTvtcTDsM/V/237401/8-MjM3NDAxOA==.jpg","id":9},{"imageUrl":"http://imgs.juheapi.com/comic_xin/0MGwzbTvtcTDsM/V/237401/9-MjM3NDAxOQ==.jpg","id":10},{"imageUrl":"http://imgs.juheapi.com/comic_xin/0MGwzbTvtcTDsM/V/237401/10-MjM3NDAxMTA=.jpg","id":11},{"imageUrl":"http://imgs.juheapi.com/comic_xin/0MGwzbTvtcTDsM/V/237401/11-MjM3NDAxMTE=.jpg","id":12},{"imageUrl":"http://imgs.juheapi.com/comic_xin/0MGwzbTvtcTDsM/V/237401/12-MjM3NDAxMTI=.jpg","id":13},{"imageUrl":"http://imgs.juheapi.com/comic_xin/0MGwzbTvtcTDsM/V/237401/13-MjM3NDAxMTM=.jpg","id":14},{"imageUrl":"http://imgs.juheapi.com/comic_xin/0MGwzbTvtcTDsM/V/237401/14-MjM3NDAxMTQ=.jpg","id":15}]}
     */

    private int error_code;
    private String reason;
    private ResultBean result;

    public int getError_code() {
        return error_code;
    }

    public void setError_code(int error_code) {
        this.error_code = error_code;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public ResultBean getResult() {
        return result;
    }

    public void setResult(ResultBean result) {
        this.result = result;
    }

    public static class ResultBean {
        /**
         * comicName : 辛巴达的冒险
         * chapterId : 237401
         * imageList : [{"imageUrl":"http://imgs.juheapi.com/comic_xin/0MGwzbTvtcTDsM/V/237401/0-MjM3NDAxMA==.jpg","id":1},{"imageUrl":"http://imgs.juheapi.com/comic_xin/0MGwzbTvtcTDsM/V/237401/1-MjM3NDAxMQ==.jpg","id":2},{"imageUrl":"http://imgs.juheapi.com/comic_xin/0MGwzbTvtcTDsM/V/237401/2-MjM3NDAxMg==.jpg","id":3},{"imageUrl":"http://imgs.juheapi.com/comic_xin/0MGwzbTvtcTDsM/V/237401/3-MjM3NDAxMw==.jpg","id":4},{"imageUrl":"http://imgs.juheapi.com/comic_xin/0MGwzbTvtcTDsM/V/237401/4-MjM3NDAxNA==.jpg","id":5},{"imageUrl":"http://imgs.juheapi.com/comic_xin/0MGwzbTvtcTDsM/V/237401/5-MjM3NDAxNQ==.jpg","id":6},{"imageUrl":"http://imgs.juheapi.com/comic_xin/0MGwzbTvtcTDsM/V/237401/6-MjM3NDAxNg==.jpg","id":7},{"imageUrl":"http://imgs.juheapi.com/comic_xin/0MGwzbTvtcTDsM/V/237401/7-MjM3NDAxNw==.jpg","id":8},{"imageUrl":"http://imgs.juheapi.com/comic_xin/0MGwzbTvtcTDsM/V/237401/8-MjM3NDAxOA==.jpg","id":9},{"imageUrl":"http://imgs.juheapi.com/comic_xin/0MGwzbTvtcTDsM/V/237401/9-MjM3NDAxOQ==.jpg","id":10},{"imageUrl":"http://imgs.juheapi.com/comic_xin/0MGwzbTvtcTDsM/V/237401/10-MjM3NDAxMTA=.jpg","id":11},{"imageUrl":"http://imgs.juheapi.com/comic_xin/0MGwzbTvtcTDsM/V/237401/11-MjM3NDAxMTE=.jpg","id":12},{"imageUrl":"http://imgs.juheapi.com/comic_xin/0MGwzbTvtcTDsM/V/237401/12-MjM3NDAxMTI=.jpg","id":13},{"imageUrl":"http://imgs.juheapi.com/comic_xin/0MGwzbTvtcTDsM/V/237401/13-MjM3NDAxMTM=.jpg","id":14},{"imageUrl":"http://imgs.juheapi.com/comic_xin/0MGwzbTvtcTDsM/V/237401/14-MjM3NDAxMTQ=.jpg","id":15}]
         */

        private String comicName;
        private int chapterId;
        private List<ImageListBean> imageList;

        public String getComicName() {
            return comicName;
        }

        public void setComicName(String comicName) {
            this.comicName = comicName;
        }

        public int getChapterId() {
            return chapterId;
        }

        public void setChapterId(int chapterId) {
            this.chapterId = chapterId;
        }

        public List<ImageListBean> getImageList() {
            return imageList;
        }

        public void setImageList(List<ImageListBean> imageList) {
            this.imageList = imageList;
        }

        public static class ImageListBean {
            /**
             * imageUrl : http://imgs.juheapi.com/comic_xin/0MGwzbTvtcTDsM/V/237401/0-MjM3NDAxMA==.jpg
             * id : 1
             */

            private String imageUrl;
            private int id;

            public String getImageUrl() {
                return imageUrl;
            }

            public void setImageUrl(String imageUrl) {
                this.imageUrl = imageUrl;
            }

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }
        }
    }
}
