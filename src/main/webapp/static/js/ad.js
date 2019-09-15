window.TencentGDT = window.TencentGDT || [];
TencentGDT.push({
    app_id: '1109751177',
    placement_id: '9030089268995929',// 必须为字符串
    type: 'native',
    count: 3, // 拉取广告的数量，必填，默认是3，最高支持10
    onComplete: function(res) { // 拉取完广告的回调函数，必填。
        if (res && res.constructor === Array) {
            // 原生模板广告位调用 window.TencentGDT.NATIVE.renderAd(res[0], 'containerId') 进行模板广告的渲染
            window.TencentGDT.NATIVE.renderAd(res[0], 'containerId')
        } else {
            // 此次回调中没有广告信息，开发者自行决定是否填充自己的广告
        }
    }
});

// 拉取广告
window.TencentGDT.NATIVE.loadAd(placement_id)

(function() {
    var doc = document,
        h = doc.getElementsByTagName('head')[0],
        s = doc.createElement('script');
    s.async = true;
    s.src = '//qzs.qq.com/qzone/biz/res/i.js';
    h && h.insertBefore(s, h.firstChild);
})();