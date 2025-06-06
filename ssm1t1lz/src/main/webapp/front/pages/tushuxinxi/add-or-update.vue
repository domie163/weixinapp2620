<template>
	<view class="content">
		<form class="app-update-pv">
			
									<view :style='{"boxShadow":"0 0 2rpx rgba(0,0,0,.8)","backgroundColor":"rgba(255, 255, 255, 0.25)","borderColor":"#ccc","margin":"0","borderWidth":"0","borderStyle":"solid","height":"88rpx"}' class="cu-form-group">
				<view :style='{"width":"22%","fontSize":"24rpx","color":"rgba(0, 0, 0, 1)","textAlign":"left"}' class="title">图书名称</view>
				<input :style='{"boxShadow":"0 0 0px rgba(0,0,0,.6) inset","backgroundColor":"rgba(255, 255, 255, 0)","borderColor":"rgba(205, 205, 205, 1)","borderRadius":"16rpx","color":"rgba(0, 0, 0, 1)","textAlign":"left","borderWidth":"2rpx","fontSize":"26rpx","borderStyle":"solid","height":"60rpx"}' :disabled="ro.tushumingcheng" v-model="ruleForm.tushumingcheng" placeholder="图书名称"></input>
			</view>
												<view :style='{"boxShadow":"0 0 2rpx rgba(0,0,0,.8)","backgroundColor":"rgba(255, 255, 255, 0.25)","borderColor":"#ccc","margin":"0","borderWidth":"0","borderStyle":"solid","height":"88rpx"}' class="cu-form-group">
				<view :style='{"width":"22%","fontSize":"24rpx","color":"rgba(0, 0, 0, 1)","textAlign":"left"}' class="title">内容关键词</view>
				<input :style='{"boxShadow":"0 0 0px rgba(0,0,0,.6) inset","backgroundColor":"rgba(255, 255, 255, 0)","borderColor":"rgba(205, 205, 205, 1)","borderRadius":"16rpx","color":"rgba(0, 0, 0, 1)","textAlign":"left","borderWidth":"2rpx","fontSize":"26rpx","borderStyle":"solid","height":"60rpx"}' :disabled="ro.neirongguanjianci" v-model="ruleForm.neirongguanjianci" placeholder="内容关键词"></input>
			</view>
												<view :style='{"boxShadow":"0 0 2rpx rgba(0,0,0,.8)","backgroundColor":"rgba(255, 255, 255, 0.25)","borderColor":"#ccc","margin":"0","borderWidth":"0","borderStyle":"solid","height":"88rpx"}' class="cu-form-group">
				<view :style='{"width":"22%","fontSize":"24rpx","color":"rgba(0, 0, 0, 1)","textAlign":"left"}' class="title">图书编号</view>
				<input :style='{"boxShadow":"0 0 0px rgba(0,0,0,.6) inset","backgroundColor":"rgba(255, 255, 255, 0)","borderColor":"rgba(205, 205, 205, 1)","borderRadius":"16rpx","color":"rgba(0, 0, 0, 1)","textAlign":"left","borderWidth":"2rpx","fontSize":"26rpx","borderStyle":"solid","height":"60rpx"}' :disabled="ro.tushubianhao" v-model="ruleForm.tushubianhao" placeholder="图书编号"></input>
			</view>
												<view :style='{"boxShadow":"0 0 2rpx rgba(0,0,0,.8)","backgroundColor":"rgba(255, 255, 255, 0.25)","borderColor":"#ccc","margin":"0","borderWidth":"0","borderStyle":"solid","height":"108rpx"}' class="cu-form-group select">
				<view :style='{"width":"22%","fontSize":"24rpx","color":"rgba(0, 0, 0, 1)","textAlign":"left"}' class="title">图书类型</view>
				<picker @change="tushuleixingChange" :value="tushuleixingIndex" :range="tushuleixingOptions">
					<view :style='{"boxShadow":"0 0 16rpx rgba(0,0,0,.6) inset","backgroundColor":"rgba(255, 255, 255, 0)","borderColor":"rgba(0,0,0,.6)","borderRadius":"16rpx","color":"rgba(0, 0, 0, 1)","textAlign":"left","borderWidth":"2rpx","fontSize":"28rpx","borderStyle":"solid","height":"88rpx"}' class="uni-input">{{ruleForm.tushuleixing?ruleForm.tushuleixing:"请选择图书类型"}}</view>
				</picker>
			</view>
												<view :style='{"boxShadow":"0 0 2rpx rgba(0,0,0,.8)","backgroundColor":"rgba(255, 255, 255, 0.25)","borderColor":"#ccc","margin":"0","borderWidth":"0","borderStyle":"solid","height":"88rpx"}' class="cu-form-group">
				<view :style='{"width":"22%","fontSize":"24rpx","color":"rgba(0, 0, 0, 1)","textAlign":"left"}' class="title">图书简介</view>
				<input :style='{"boxShadow":"0 0 0px rgba(0,0,0,.6) inset","backgroundColor":"rgba(255, 255, 255, 0)","borderColor":"rgba(205, 205, 205, 1)","borderRadius":"16rpx","color":"rgba(0, 0, 0, 1)","textAlign":"left","borderWidth":"2rpx","fontSize":"26rpx","borderStyle":"solid","height":"60rpx"}' :disabled="ro.tushujianjie" v-model="ruleForm.tushujianjie" placeholder="图书简介"></input>
			</view>
												<view :style='{"boxShadow":"0 0 16rpx rgba(0,0,0,.3)","backgroundColor":"rgba(255, 255, 255, 0.25)","borderColor":"#ccc","margin":"0 0 20rpx 0","borderWidth":"0","borderStyle":"solid","height":"108rpx"}' class="cu-form-group" @tap="tupianTap" :class='left == "left"?"":"active"'>
				<view :style='{"width":"22%","fontSize":"24rpx","color":"rgba(1, 1, 1, 1)","textAlign":"left"}' class="title">图片</view>
				<view class="right-input" :style='{textAlign:"left"}' style="padding:0">
					<image :style='{"width":"100rpx","boxShadow":"0 0 16rpx rgba(0,0,0,.3)","borderRadius":"2%","textAlign":"left","height":"100rpx"}' class="avator" v-if="ruleForm.tupian" :src="ruleForm.tupian" mode="aspectFill"></image>
					<image :style='{"width":"100rpx","boxShadow":"0 0 16rpx rgba(0,0,0,.3)","borderRadius":"2%","textAlign":"left","height":"100rpx"}' class="avator" v-else src="../../static/gen/upload.png" mode="aspectFill"></image>
				</view>
			</view>
												<view :style='{"boxShadow":"0 0 16rpx rgba(0,0,0,.3)","backgroundColor":"rgba(255, 255, 255, 0.25)","borderColor":"#ccc","margin":"0 0 20rpx 0","borderWidth":"0","borderStyle":"solid","height":"108rpx"}' class="cu-form-group" @tap="tushushangchuanTap" :class='left == "left"?"":"active"'>
				<view :style='{"width":"22%","fontSize":"24rpx","color":"rgba(1, 1, 1, 1)","textAlign":"left"}' class="title">图书上传</view>
				<view class="right-input" :style='{textAlign:"left"}' style="padding:0">
					<image :style='{"width":"100rpx","boxShadow":"0 0 16rpx rgba(0,0,0,.3)","borderRadius":"2%","textAlign":"left","height":"100rpx"}' class="avator" v-if="ruleForm.tushushangchuan" :src="ruleForm.tushushangchuan" mode="aspectFill"></image>
					<image :style='{"width":"100rpx","boxShadow":"0 0 16rpx rgba(0,0,0,.3)","borderRadius":"2%","textAlign":"left","height":"100rpx"}' class="avator" v-else src="../../static/gen/upload.png" mode="aspectFill"></image>
				</view>
			</view>
												<view :style='{"boxShadow":"0 0 16rpx rgba(0,0,0,.3)","backgroundColor":"rgba(255, 255, 255, 0.25)","borderColor":"#ccc","margin":"0 0 20rpx 0","borderWidth":"0","borderStyle":"solid","height":"108rpx"}' class="cu-form-group" @tap="tushuxiazaiTap" :class='left == "left"?"":"active"'>
				<view :style='{"width":"22%","fontSize":"24rpx","color":"rgba(1, 1, 1, 1)","textAlign":"left"}' class="title">图书下载</view>
				<view class="right-input" :style='{textAlign:"left"}' style="padding:0">
					<input :style='{"boxShadow":"0 0 0px rgba(0,0,0,.6) inset","backgroundColor":"rgba(255, 255, 255, 0)","borderColor":"rgba(205, 205, 205, 1)","borderRadius":"16rpx","color":"rgba(0, 0, 0, 1)","textAlign":"left","borderWidth":"2rpx","fontSize":"26rpx","borderStyle":"solid","height":"60rpx"}' v-if="ruleForm.tushuxiazai"  v-model="ruleForm.tushuxiazai" placeholder="图书下载"></input>
					<image :style='{"width":"100rpx","boxShadow":"0 0 16rpx rgba(0,0,0,.3)","borderRadius":"2%","textAlign":"left","height":"100rpx"}' class="avator" v-else src="../../static/gen/upload.png" mode="aspectFill"></image>
				</view>
			</view>
									
			<!-- 否 -->
 
			
			          				          				          				          				          				          				          				          							
			          				          				          				          				          				          				          				          							
			<view class="btn">
				<button :style='{"boxShadow":"0 0 0px rgba(0,0,0,0) inset","backgroundColor":"rgba(242, 199, 68, 1)","borderColor":"rgba(57, 78, 99, 1)","borderRadius":"40rpx","color":"rgba(0, 0, 0, 1)","borderWidth":"0","width":"40%","fontSize":"28rpx","borderStyle":"solid","height":"76rpx"}' @tap="onSubmitTap" class="bg-red">提交</button>
			</view>
		</form>

																																					
	</view>
</template>

<script>
	import wPicker from "@/components/w-picker/w-picker.vue";

	export default {
		data() {
			return {
				ruleForm: {
												tushumingcheng: '',
																neirongguanjianci: '',
																tushubianhao: '',
																tushuleixing: '',
																tushujianjie: '',
																tupian: '',
																tushushangchuan: '',
																tushuxiazai: '',
												},
																																				tushuleixingOptions: [],
				tushuleixingIndex: 0,
																																												// 登陆用户信息
				user: {},
                                ro:{
                                   tushumingcheng : false,
                                   neirongguanjianci : false,
                                   tushubianhao : false,
                                   tushuleixing : false,
                                   tushujianjie : false,
                                   tupian : false,
                                   tushushangchuan : false,
                                   tushuxiazai : false,
                                },
			}
		},
		components: {
			wPicker
		},
		computed: {
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
					},
		async onLoad(options) {
			let table = uni.getStorageSync("nowTable");
			// 获取用户信息
			let res = await this.$api.session(table);
			this.user = res.data;
			
						// ss读取
																																																						
																														// 下拉框
			res = await this.$api.option(`tushuleixing`,`tushuleixing`,{});
			this.tushuleixingOptions = res.data;
																																	
			// 如果有登陆，获取登陆后保存的userid
			this.ruleForm.userid = uni.getStorageSync("userid")
			if (options.refid) {
				// 如果上一级页面传递了refid，获取改refid数据信息
				this.ruleForm.refid = options.refid;
				this.ruleForm.nickname = uni.getStorageSync("nickname");
			}
			// 如果是更新操作
			if (options.id) {
				this.ruleForm.id = options.id;
				// 获取信息
				res = await this.$api.info(`tushuxinxi`, this.ruleForm.id);
				this.ruleForm = res.data;
			}
			// 跨表
			if(options.cross){
				var obj = uni.getStorageSync('crossObj');
				for (var o in obj){
					if(o=='tushumingcheng'){
					this.ruleForm.tushumingcheng = obj[o];
					this.ro.tushumingcheng = true;
					continue;
					}
					if(o=='neirongguanjianci'){
					this.ruleForm.neirongguanjianci = obj[o];
					this.ro.neirongguanjianci = true;
					continue;
					}
					if(o=='tushubianhao'){
					this.ruleForm.tushubianhao = obj[o];
					this.ro.tushubianhao = true;
					continue;
					}
					if(o=='tushuleixing'){
					this.ruleForm.tushuleixing = obj[o];
					this.ro.tushuleixing = true;
					continue;
					}
					if(o=='tushujianjie'){
					this.ruleForm.tushujianjie = obj[o];
					this.ro.tushujianjie = true;
					continue;
					}
					if(o=='tupian'){
					this.ruleForm.tupian = obj[o];
					this.ro.tupian = true;
					continue;
					}
					if(o=='tushushangchuan'){
					this.ruleForm.tushushangchuan = obj[o];
					this.ro.tushushangchuan = true;
					continue;
					}
					if(o=='tushuxiazai'){
					this.ruleForm.tushuxiazai = obj[o];
					this.ro.tushuxiazai = true;
					continue;
					}
				}
			}
			this.styleChange()
		},
		methods: {
			styleChange() {
				this.$nextTick(()=>{
					// document.querySelectorAll('.app-update-pv .cu-form-group .uni-input-input').forEach(el=>{
					//   el.style.backgroundColor = this.addUpdateForm.input.content.backgroundColor
					// })
				})
			},
																																																						
			// 多级联动参数
																																																						
																																																			
																																																			
																											// 下拉变化
			tushuleixingChange(e) {
				this.tushuleixingIndex = e.target.value
				this.ruleForm.tushuleixing = this.tushuleixingOptions[this.tushuleixingIndex]
			},
																														
																																																						tupianTap() {
				let _this = this;
				this.$api.upload(function(res) {
					_this.ruleForm.tupian = _this.$base.url + 'upload/' + res.file;
					_this.$forceUpdate();
					_this.$nextTick(()=>{
						_this.styleChange()
					})
				});
			},
															tushushangchuanTap() {
				let _this = this;
				this.$api.upload(function(res) {
					_this.ruleForm.tushushangchuan = _this.$base.url + 'upload/' + res.file;
					_this.$forceUpdate();
					_this.$nextTick(()=>{
						_this.styleChange()
					})
				});
			},
															tushuxiazaiTap() {
				let _this = this;
				this.$api.upload(function(res) {
					_this.ruleForm.tushuxiazai = _this.$base.url + 'upload/' + res.file;
					_this.$forceUpdate();
					_this.$nextTick(()=>{
						_this.styleChange()
					})
				});
			},
									
			getUUID () {
				return new Date().getTime();
			},
			async onSubmitTap() {
																																																																																																																																																																																																																																																																																																																												if((!this.ruleForm.tushumingcheng)){
					this.$utils.msg(`图书名称不能为空`);
					return
				}
																																																																																																																				if((!this.ruleForm.tushuleixing)){
					this.$utils.msg(`图书类型不能为空`);
					return
				}
																																																																																																																																																																																								if(this.ruleForm.id){
					await this.$api.update(`tushuxinxi`, this.ruleForm);
				}else{
					await this.$api.add(`tushuxinxi`, this.ruleForm);
				}
				this.$utils.msgBack('提交成功');
			},
			optionsChange(e) {
				this.index = e.target.value
			},
			bindDateChange(e) {
				this.date = e.target.value
			},
			getDate(type) {
				const date = new Date();
				let year = date.getFullYear();
				let month = date.getMonth() + 1;
				let day = date.getDate();
				if (type === 'start') {
					year = year - 60;
				} else if (type === 'end') {
					year = year + 2;
				}
				month = month > 9 ? month : '0' + month;;
				day = day > 9 ? day : '0' + day;
				return `${year}-${month}-${day}`;
			},
			toggleTab(str) {
				this.$refs[str].show();
			}
		}
	}
</script>

<style lang="scss" scoped>
	.container {
		padding: 20upx;
	}
	
	.content:after {
		position: fixed;
		top: 0;
		right: 0;
		left: 0;
		bottom: 0;
		content: '';
				background-attachment: fixed;
		background-size: cover;
		background-position: center;
	}

	textarea {
		border: 1upx solid #EEEEEE;
		border-radius: 20upx;
		padding: 20upx;
	}

	.title {
		width: 180upx;
	}

	.avator {
		width: 150upx;
		height: 60upx;
	}

	.right-input {
		flex: 1;
		text-align: left;
		padding: 0 24upx;
	}
	
	.cu-form-group.active {
		justify-content: space-between;
	}
	
	.btn {
	  display: flex;
	  align-items: center;
	  justify-content: center;
	  flex-wrap: wrap;
	  padding: 20upx 0;
	}
	
	.cu-form-group {
		padding: 0 24upx;
		background-color: transparent;
		min-height: inherit;
	}
	
	.cu-form-group+.cu-form-group {
		border: 0;
	}
	
	.cu-form-group uni-input {
		padding: 0 30upx;
	}
	
	.uni-input {
		padding: 0 30upx;
	}
	
	.cu-form-group uni-textarea {
		padding: 30upx;
		margin: 0;
	}
	
	.cu-form-group uni-picker::after {
		line-height: 88rpx;
	}
	
	.select .uni-input {
		line-height: 88rpx;
	}
	
	.input .right-input {
		line-height: 60rpx;
	}
</style>
