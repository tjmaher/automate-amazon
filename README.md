# automate-amazon
<i>December 2015 - January 2016</i><br>
<p>A practice automation test framework for Amazon.com, based on the knowledge gained as a first year automation engineer at Fitbit-Boston.</p>
<p><b>Problems:</b> I wasn't able to set up tests to run in parallel. I didn't initially build that into DriverUtils, and haven't been able to figure this part out.</p>
<b>Blog: Adventures in Automation</b>
<i>A sample project in order to practice designing automated test frameworks.&nbsp;</i><br />
<blockquote class="tr_bq">
Automate Amazon:<br />
<ul>
<li><a href="http://www.tjmaher.com/2015/12/next-week-automating-amazon-how-i-am.html" target="_blank">Introduction</a></li>
<li>Part One:&nbsp;<a href="http://www.tjmaher.com/2015/12/automate-amazon-development-environment.html" target="_blank">Development Environment Setup</a></li>
<li>Part Two:&nbsp;<a href="http://www.tjmaher.com/2015/12/automate-amazon-sketch-out-use-case.html" target="_blank">Sketch Out a Use Case</a></li>
<li>Part Three:&nbsp;<a href="http://www.tjmaher.com/2015/12/automate-amazon-commonutils-methods-and.html" target="_blank">CommonUtils, methods and exceptions</a></li>
<li>Part Four:&nbsp;<a href="http://www.tjmaher.com/2015/12/automate-amazon-writing-sign-in-test.html" target="_blank">Writing a Sign In Test</a></li>
<li>Part Five:&nbsp;<a href="http://www.tjmaher.com/2016/01/automate-amazon-productenums-and.html" target="_blank">Product Enums and Product Objects</a></li>
<li>Part Six:&nbsp;<a href="http://www.tjmaher.com/2016/01/automate-amazon-initializing-login-and.html" target="_blank">Initializing Login and Cart</a></li>
<li>Part Seven:&nbsp;<a href="http://www.tjmaher.com/2016/01/automate-amazon-writing-shopping-cart.html" target="_blank">Writing a Shopping Cart Test</a></li>
<li>Part Eight:&nbsp;<a href="http://www.tjmaher.com/2016/01/automate-amazon-sketch-of-possible-data.html" target="_blank">Data Driven Tests with TestNG XML</a></li>
</ul>
</blockquote>

The directory structure:
<br />
<b>src/test/java</b><br />
<ul>
<li>actions</li>
<ul>
<li><a href="https://github.com/tjmaher/automate-amazon/blob/master/automate-amazon/src/test/java/actions/OrderActions.java">OrderActions</a></li>
</ul>
<li><a href="https://github.com/tjmaher/automate-amazon/tree/master/automate-amazon/src/test/java/base">base</a></li>
<ul>
<li><a href="https://github.com/tjmaher/automate-amazon/blob/master/automate-amazon/src/test/java/base/LoadProperties.java">LoadProperties</a></li>
</ul>
<li>enums</li>
<ul>
<li><a href="https://github.com/tjmaher/automate-amazon/blob/master/automate-amazon/src/test/java/enums/Products.java">Products</a></li>
<li><a href="https://github.com/tjmaher/automate-amazon/blob/master/automate-amazon/src/test/java/enums/Url.java">Url</a></li>
</ul>
<li>pages</li>
<ul>
<li><a href="https://github.com/tjmaher/automate-amazon/blob/master/automate-amazon/src/test/java/pages/HomePage.java">HomePage</a></li>
<li><a href="https://github.com/tjmaher/automate-amazon/blob/master/automate-amazon/src/test/java/pages/SignInPage.java">SignInPage</a></li>
<li><a href="https://github.com/tjmaher/automate-amazon/blob/master/automate-amazon/src/test/java/pages/ProductPage.java">ProductPage</a></li>
<li><a href="https://github.com/tjmaher/automate-amazon/blob/master/automate-amazon/src/test/java/pages/ShoppingCartPage.java">ShoppingCartPage</a></li>
<li><a href="https://github.com/tjmaher/automate-amazon/blob/master/automate-amazon/src/test/java/pages/ShoppingCartReviewPage.java">ShoppingCartReviewPage</a></li>
</ul>
<li>pojo</li>
<ul>
<li><a href="https://github.com/tjmaher/automate-amazon/blob/master/automate-amazon/src/test/java/pojo/Book.java">Book</a></li>
</ul>
<li>properties</li>
<ul>
<li><a href="https://github.com/tjmaher/automate-amazon/blob/master/automate-amazon/src/test/java/properties/user.properties">user.properties</a></li>
</ul>
<li>testcases</li>
<ul>
<li><a href="https://github.com/tjmaher/automate-amazon/blob/master/automate-amazon/src/test/java/testcases/PurchaseOrderTest.java">PurchaseOrderTest</a></li>
</ul>
<li>utils</li>
<ul>
<li><a href="https://github.com/tjmaher/automate-amazon/blob/master/automate-amazon/src/test/java/utils/CommonUtils.java">CommonUtils</a></li>
<li><a href="https://github.com/tjmaher/automate-amazon/blob/master/automate-amazon/src/test/java/utils/DriverUtils.java">DriverUtils</a></li>
</ul>
</ul>
