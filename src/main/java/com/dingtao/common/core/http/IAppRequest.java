package com.dingtao.common.core.http;

import android.os.AsyncTask;
import android.widget.AbsSeekBar;

import com.dingtao.common.bean.Balance;
import com.dingtao.common.bean.CommentListBean;
import com.dingtao.common.bean.Danmu;
import com.dingtao.common.bean.DepartmentBean;
import com.dingtao.common.bean.DoctorMessageBean;
import com.dingtao.common.bean.LoginBean;

import com.dingtao.common.bean.Banner;
import com.dingtao.common.bean.Result;
import com.dingtao.common.bean.Sendmessage;
import com.dingtao.common.bean.ShouYe.BingZhengXiangBean;
import com.dingtao.common.bean.ShouYe.FindDrugsKnowsBean;
import com.dingtao.common.bean.ShouYe.JianKangItemBean;
import com.dingtao.common.bean.ShouYe.JianXiangQiangBean;
import com.dingtao.common.bean.ShouYe.ShouYeJianKnagBean;
import com.dingtao.common.bean.ShouYe.ShouYeWenZhen;
import com.dingtao.common.bean.ShouYe.WenDoctorBean;
import com.dingtao.common.bean.ShouYe.YaoBean;
import com.dingtao.common.bean.ShouYe.YaoXiangBean;
import com.dingtao.common.bean.ShouYe.keshiBean;
import com.dingtao.common.bean.ShouziBean;
import com.dingtao.common.bean.SickCircleInfoBean;
import com.dingtao.common.bean.SickCircleListBean;
import com.dingtao.common.bean.Video;
import com.dingtao.common.bean.VideoItem;
import com.dingtao.common.bean.Wallect;
import com.dingtao.common.bean.WoDe.CurrentListBean;
import com.dingtao.common.bean.WoDe.HosiToryListBean;
import com.dingtao.common.bean.XiaoFei;
import com.dingtao.common.bean.shouchangBean;
import com.dingtao.common.bean.shoushipingBean;
import com.dingtao.common.bean.video.VideoDanBean;
import com.dingtao.common.bean.video.VideoLeimuBean;
import com.dingtao.common.bean.video.VideoitemBean;
import com.dingtao.common.bean.xitong_bean;
import com.dingtao.common.bean.zixun.DoctorUserNameBean;

import java.io.File;
import java.util.List;

import io.reactivex.Observable;
import okhttp3.MultipartBody;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.Header;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.GET;
import retrofit2.http.PUT;
import retrofit2.http.Query;

public interface IAppRequest {



    ///邮箱 验证
    @FormUrlEncoded
    @POST("user/v1/sendOutEmailCode")
    Observable<Result> youxiang(@Field("email")String email);


    // 注册
    @FormUrlEncoded
    @POST("user/v1/register")
    Observable<Result> register(@Field("email")String email,@Field("code")String code,@Field("pwd1")String pwd1
    ,@Field("pwd2")String pwd2);


    //登录
    @FormUrlEncoded
    @POST("user/v1/login")
    Observable<Result<LoginBean>> login(@Field("email")String email, @Field("pwd")String pwd);


    //首页 科室 分类


    //首页科室分类
    @GET("share/knowledgeBase/v1/findDepartment")
    Observable<Result<List<ShouYeWenZhen>>> ShouYeWenZhenGet();

    //查询健康资讯板块
    @GET("share/information/v1/findInformationPlateList")
     Observable<Result<List<ShouYeJianKnagBean>>> ShouYeJianKnag();


    //用户签到
    @FormUrlEncoded
    @POST("user/verify/v1/addSign")
    Observable<Result> qiandao(@Field("userId") String userId,@Field("sessionId") String sessionId);



    //根据资讯板块查询资讯列表
    @GET("share/information/v1/findInformationList")
    Observable<Result<List<JianKangItemBean>>> JianKangITem(@Query("plateId")String plateId,
                                                            @Query("page")String page,
                                                            @Query("count")String count
                                                            );

     //banner
    @GET("share/v1/bannersShow")
    Observable<Result<List<Banner>>> bannerShow();
    //详情

    @GET("share/information/v1/findInformation")
    Observable<Result<JianXiangQiangBean>> XiangQing(@Query("userId")String userId,
                                                     @Query("sessionId")String sessionId,
                                                     @Query("infoId")String infoId
                                                     );
    //收藏
    @FormUrlEncoded
    @POST("user/verify/v1/addInfoCollection")
    Observable<Result> addInfo(@Header("userId")String userId,
                               @Header("sessionId")String sessionId,
                               @Field("infold")String infold
                               );




    //查询医生列表
    @GET("user/inquiry/v1/findDoctorList")
    Observable<Result<List<WenDoctorBean>>> findDoctorList(@Header("userId")String userId,
                                                           @Header("sessionId")String sessionId,
                                                           @Query("deptId")String deptId,
                                                           @Query("condition")String condition,
                                                           @Query("sortBy")String sortBy,
                                                           @Query("page")String page,
                                                           @Query("count")String count
    );

    //根据科室查询对应病症
    @GET("share/knowledgeBase/v1/findDiseaseCategory")
    Observable<Result<List<keshiBean>>> genjukehsi(@Query("departmentId")String departmentId);

    //. 药品科目分类列表查询
    @GET("share/knowledgeBase/v1/findDrugsCategoryList")
    Observable<Result<List<YaoBean>>> yaoping();

    //根据药品类目查询常见药品
    @GET("share/knowledgeBase/v1/findDrugsKnowledgeList")
    Observable<Result<List<YaoXiangBean>>> yaoxiangbean(@Query("drugsCategoryId")String drugsCategoryId,@Query("page") int page,@Query("count")int count);

    //修改 密码
    @PUT("user/verify/v1/updateUserPwd")
    Observable<Result> xiugaimima(@Header("userId")Long userId,
                                  @Header("sessionId")String sessionId,
                                  @Query("oldPwd")String oldPwd,
                                  @Query("newPwd")String newPwd);

    //重置用户密码（忘记密码用）
    @PUT("user/v1/resetUserPwd")
    Observable<Result> wangjimima(@Query("email")String email,@Query("pwd1")String pwd1,
                                  @Query("pwd2")String pwd2);


    //根据用户ID查询用户信息
    @GET("user/verify/v1/getUserInfoById")
    Observable<Result<LoginBean>> chayonghu(@Header("userId")Long userId,
                                            @Header("sessionId")String sessionId);

    //修改 用户昵称
    @PUT("user/verify/v1/modifyNickName")
    Observable<Result> xiugaiyonghu(@Header("userId")Long userId,
                                    @Header("sessionId")String sessionId,
                                    @Query("nickName")String nickName);

    //上传用户头像
    @POST("user/verify/v1/modifyHeadPic")
    Observable<Result<String>> shangchuangtouxiang(@Header("userId")Long userId,
                                                   @Header("sessionId")String sessionId,
                                                   @Body MultipartBody body);

    //查询用户资讯收藏列表
    @GET("user/verify/v1/findUserInfoCollectionList")
    Observable<Result<List<ShouziBean>>> Shouzixun(@Header("userId")Long userId,
                                                   @Header("sessionId") String sessionId,
                                                   @Query("page")int page,
                                                   @Query("count")int count);

    //查询常见病症详情
    @GET("share/knowledgeBase/v1/findDiseaseKnowledge")
    Observable<Result<BingZhengXiangBean>>     findDiseaseKnowledge(@Query("id")String id);


    //查询药品详情
    @GET("share/knowledgeBase/v1/findDrugsKnowledge")
    Observable<Result<FindDrugsKnowsBean>> findDrugsKnowledge(@Query("id")String id);



    //  病友圈列表展示
    @GET("user/sickCircle/v1/findSickCircleList?count=10")
    Observable<Result<List<SickCircleListBean>>> findSickCircleList(@Query("departmentId") String departmentId,
                                                                    @Query("page") String page);




    //  查询病友圈详情
    @GET("user/sickCircle/v1/findSickCircleInfo")
    Observable<Result<SickCircleInfoBean>> findSickCircleInfo(@Header("userId") String userId,
                                                              @Header("sessionId") String sessionId,
                                                              @Query("sickCircleId") String sickCircleId);

    //  根据关键词查询病友圈
    @GET("user/sickCircle/v1/searchSickCircle")
    Observable<Result<List<SickCircleInfoBean>>> searchSickCircle(@Query("keyWord") String keyWord);

    //  病友圈发表评论
    @FormUrlEncoded
    @POST("user/sickCircle/verify/v1/publishComment")
    Observable<Result> publishComment(@Header("userId") String userId,
                                      @Header("sessionId") String sessionId,
                                      @Field("sickCircleId") String sickCircleId,
                                      @Field("content") String content);

    //  查询病友圈评论列表
    @GET("user/sickCircle/v1/findSickCircleCommentList?count=5")
    Observable<Result<List<CommentListBean>>> findSickCircleCommentList(@Header("userId") String userId,
                                                                        @Header("sessionId") String sessionId,
                                                                        @Query("sickCircleId") String sickCircleId,
                                                                        @Query("page") String page);

    //  采纳病友圈优秀的评论
    @PUT("user/sickCircle/verify/v1/adoptionProposal")
    Observable<Result> adoptionProposal(@Header("userId") String userId,
                                        @Header("sessionId") String sessionId,
                                        @Query("sickCircleId") String sickCircleId,
                                        @Query("commentId") String commentId);

    //  收藏病友圈
    @FormUrlEncoded
    @POST("user/verify/v1/addUserSickCollection")
    Observable<Result> addUserSickCollection(@Header("userId") String userId,
                                             @Header("sessionId") String sessionId,
                                             @Query("sickCircleId") String sickCircleId);
    //  查询科室列表
    @GET("share/knowledgeBase/v1/findDepartment")
    Observable<Result<List<DepartmentBean>>> findDepartment();





    //视频条目
    @GET("user/video/v1/findVideoCategoryList")
    Observable<Result<List<VideoLeimuBean>>> videoitem();

    //视频展示
    @GET("user/video/v1/findVideoVoList")
    Observable<Result<List<VideoitemBean>>> video(@Header("userId") String userId,
                                                  @Header("sessionId") String sessionId,
                                                  @Query("categoryId") int categoryId,
                                                  @Query("page") int page,
                                                  @Query("count") int count
    );

    //购买
    @FormUrlEncoded
    @POST("user/video/verify/v1/videoBuy")
    Observable<Result> buyvideo(@Header("userId") String userId,
                                @Header("sessionId") String sessionId,
                                @Field("videoId") String videoId,
                                @Field("price") Double price
    );


    //我的钱包
    @GET("user/verify/v1/findUserWallet")
    Observable<Result> blance(@Header("userId") String userId, @Header("sessionId") String sessionId);

    //查看弹幕
    @GET("user/video/v1/findVideoCommentList")
    Observable<Result<List<VideoDanBean>>> danmu(@Query("videoId") int videoId);

    //视频收藏
    @FormUrlEncoded
    @POST("user/video/verify/v1/addUserVideoCollection")
    Observable<Result> shoucang(@Header("userId") Long userId,@Header("sessionId") String sessionId
            ,@Field("videoId") int videoId
    );

    //取消视频收藏
    @DELETE("user/verify/v1/cancelVideoCollection")
    Observable<Result> quxiaoshoucang(@Header("userId") Long userId,@Header("sessionId") String sessionId
            ,@Query("videoId") int videoId
    );
    //发表弹幕
    @POST("health/user/video/verify/v1/addVideoComment")
    Observable<Result> videoFdm(@Header("userId")int userId,@Header("sessionId")String sessionId,@Query("videoId")int id,@Query("content")String content);

    //修改用户性别
    @PUT("user/verify/v1/updateUserSex")
    Observable<Result> xiugaisex(@Header("userId")Long userId,@Header("sessionId")String sessionId,@Query("sex")String sex);

    //查询用户系统通知列表
    @GET("user/verify/v1/findSystemNoticeList")
    Observable<Result<List<xitong_bean>>> xitong(@Header("userId")Long userId, @Header("sessionId")String sessionId, @Query("page")int page, @Query("count")int count);

    //首页健康测评
    @GET("user/verify/v1/userHealthTest")
    Observable<Result> userHealthTest(@Header("userId")Long userId,
                                      @Header("sessionId")String sessionId
                                      
                                      );
    //医生详情
    @GET("user/inquiry/v1/findDoctorInfo")
    Observable<Result<DoctorMessageBean>> findDoctorInfo(@Header("userId") String userId,
                                                 @Header("sessionId") String sessionId,
                                                 @Query("doctorId")String doctorId
                                                 );
    //关注医生
    @FormUrlEncoded
    @POST("user/inquiry/verify/v1/followDoctor")
    Observable<Result> followDoctor(@Header("userId")String userId,
                                    @Header("sessionId")String sessionId,
                                    @Field("doctorId")String doctorId
                                    );
    //取消关注
    @DELETE("user/inquiry/verify/v1/cancelFollow")
    Observable<Result> cancelFollow(@Header("userId") String userId,
                                    @Header("sessionId") String sessionId,
                                    @Query("doctorId")String doctorId

    );


    //user/verify/v1/findUserConsumptionRecordList
    //消费记录
    @GET("user/verify/v1/findUserConsumptionRecordList")
    Observable<Result<List<XiaoFei>>> Record(@Header("userId")String userId,
                                             @Header("sessionId")String sessionId,
                                             @Query("page")String page,
                                             @Query("count")String count
                                             );
    //查询余额
    @GET("user/verify/v1/findUserWallet")
    Observable<Result> Wallet(@Header("userId")String userId,
                               @Header("sessionId")String sessionId);



    //5.完善用户信息
    @PUT("user/verify/v1/perfectUserInfo")
    Observable<Result> wanshanyonghu(@Header("userId")Long userId,@Header("sessionId")String sessionId,
                                     @Query("age")int age,@Query("height")int height,@Query("weight")int weight);


    //用户收藏病友圈列表
    @GET("user/verify/v1/findUserSickCollectionList")
    Observable<Result<List<shouchangBean>>> shouchang(@Header("userId")Long userId, @Header("sessionId")String sessionId, @Query("page")int page, @Query("count")int count);


    //取消病友圈收藏
    @DELETE("user/verify/v1/cancelSickCollection")
    Observable<Result> shangchu(@Header("userId")Long userId,@Header("sessionId")String sessionId ,@Query("sickCircleId")int sickCircleId);


    //用户收藏健康课堂视频列表
    @GET("user/verify/v1/findVideoCollectionList")
    Observable<Result<List<shoushipingBean>>> shoushiping(@Header("userId")Long userId, @Header("sessionId")String sessionId, @Query("page")int page, @Query("count")int count);

    //充值
    @FormUrlEncoded
    @POST("user/verify/v1/recharge")
    Observable<Result> recharge(@Header("userId")String userId,
                                @Header("sessionId")String sesssionId,
                                @Field("money")String money,
                                @Field("payType")String payType
                                );
    //咨询医生
    @PUT("user/inquiry/verify/v1/consultDoctor")
    Observable<Result<DoctorUserNameBean>> consultDoctor(
                                                         @Header("userid")String userId,
                                                         @Header("sessionId")String sessionId,
                                                         @Query("doctorId")String doctorId

                                                         );
    //查询当前问诊
    @GET("user/inquiry/verify/v1/findCurrentInquiryRecord")

    Observable<Result<CurrentListBean>> findCurrentInquiryRecord(@Header("userId")String userId,
                                                                 @Header("sessionId")String sessionId
                                                );

    //历史问诊
    @GET("user/inquiry/verify/v1/findHistoryInquiryRecord")
    Observable<Result<List<HosiToryListBean>>> findHistoryInquiryRecord(@Header("userId")String userId,
                                                                        @Header("sessionId")String sessionId,
                                                                        @Query("page")String page,
                                                                        @Query("count")String count
                                                                        );
    //发送消息
    @FormUrlEncoded
    @POST("user/inquiryerify1/pushTextMsg")
    Observable<Result> sendmessage(@Header("userId") String userId,
                                   @Header("sessionId") String sessionId,
                                   @Field("inquiryId") String inquiryId,
                                   @Field("msgContent") String msgContent,
                                   @Field("content") String content,
                                   @Field("type")String type,
                                   @Field("doctorId") String doctorId


                                    );


    //查看历史纪律
    @GET("user/inquiryerify1/findInquiryRecordList")
    Observable<Result<List<Sendmessage>>> message(@Header("userId") String userId,
                                                  @Header("sessionId") String sessionId,
                                                  @Query("inquiryId")String inquiryId,
                                                  @Query("page")String page,
                                                  @Query("count")String count
    );
    //结束问诊
    @PUT("user/inquiry/verify/v1/endInquiry")
    Observable<Result> endInquiry(@Header("userId")String userId,
                                  @Header("sessionId")String sessionId,
                                  @Query("recordId")String v
                                  );
}
