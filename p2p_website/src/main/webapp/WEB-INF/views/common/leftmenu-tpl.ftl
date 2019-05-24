<ul id="menu" class="list-group">
	<li class="list-group-item">
		<a href="javascript:;"><span>鍊熻捶椤圭洰</span></a>
		<ul>
			<li name="bid"><a href="/bid_list.do"><span>鎶曟爣鏄庣粏</span></a></li>
			<li name="receive"><a href="#"><span>鏀舵鏄庣粏</span></a></li>
			<li name="bidRequest"><a href="/borrow_list.do"><span>鍊熸椤圭洰</span></a></li>
			<li name="borrowBidReturn"><a href="/borrowBidReturn_list.do"><span>杩樻鏄庣粏</span></a></li>
		</ul>
	</li>
	<li class="list-group-item">
		<a href="#"><span class="text-title">鎴戠殑璐︽埛</span></a>
		<ul class="in">
			<li name="personal"><a href="#">璐︽埛淇℃伅</a></li>
			<li name="realAuth"><a href="/realAuth.do">瀹炲悕璁よ瘉</a></li>
			<li name="userFile"><a href="/userFile.do">椋庢帶璧勬枡璁よ瘉</a></li>
			<li name="bankInfo"><a href="/bankInfo.do">閾惰鍗＄鐞�/a></li>
			<li name="ipLog"><a href="/ipLog.do">鐧诲綍璁板綍</a></li>
			<li name="userInfo"><a href="/basicInfo.do"> <span>涓汉璧勬枡</span></a></li>
		</ul>
	</li>
	<li class="list-group-item">
		<a href="#"><span>璧勪骇璇︽儏</span></a>
		<ul class="in">
			<li name="accountFlow_list"><a href="">璐︽埛娴佹按</a></li>
			<li name="recharge"><a href="/recharge_list.do">鍏呭�鏄庣粏</a></li>
			<li name="moneyWithdraw"><a href="/moneyWithdraw.do">鎻愮幇鐢宠</a></li>
		</ul>
	</li>
</ul>

<#if currentMenu??>
<script type="text/javascript">
	$(".list-group-item li[name=${currentMenu}]").addClass("active");
</script>
</#if>
