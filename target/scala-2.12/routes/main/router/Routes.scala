// @GENERATOR:play-routes-compiler
// @SOURCE:/home/wiki/Pulpit/e-biznes-main/shop-project/shop-project/conf/routes
// @DATE:Thu Aug 19 21:51:00 CEST 2021

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._

import play.api.mvc._

import _root_.controllers.Assets.Asset

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:2
  HomeController_11: controllers.HomeController,
  // @LINE:5
  Assets_10: controllers.Assets,
  // @LINE:8
  ProductController_8: controllers.ProductController,
  // @LINE:23
  CategoryController_6: controllers.CategoryController,
  // @LINE:38
  UserController_9: controllers.UserController,
  // @LINE:53
  UserPaymentController_1: controllers.UserPaymentController,
  // @LINE:68
  UserAddressController_5: controllers.UserAddressController,
  // @LINE:83
  DiscountController_12: controllers.DiscountController,
  // @LINE:98
  CartController_2: controllers.CartController,
  // @LINE:113
  OrderController_3: controllers.OrderController,
  // @LINE:128
  CartItemController_4: controllers.CartItemController,
  // @LINE:143
  ProductReviewController_7: controllers.ProductReviewController,
  // @LINE:161
  SocialAuthController_0: controllers.SocialAuthController,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:2
    HomeController_11: controllers.HomeController,
    // @LINE:5
    Assets_10: controllers.Assets,
    // @LINE:8
    ProductController_8: controllers.ProductController,
    // @LINE:23
    CategoryController_6: controllers.CategoryController,
    // @LINE:38
    UserController_9: controllers.UserController,
    // @LINE:53
    UserPaymentController_1: controllers.UserPaymentController,
    // @LINE:68
    UserAddressController_5: controllers.UserAddressController,
    // @LINE:83
    DiscountController_12: controllers.DiscountController,
    // @LINE:98
    CartController_2: controllers.CartController,
    // @LINE:113
    OrderController_3: controllers.OrderController,
    // @LINE:128
    CartItemController_4: controllers.CartItemController,
    // @LINE:143
    ProductReviewController_7: controllers.ProductReviewController,
    // @LINE:161
    SocialAuthController_0: controllers.SocialAuthController
  ) = this(errorHandler, HomeController_11, Assets_10, ProductController_8, CategoryController_6, UserController_9, UserPaymentController_1, UserAddressController_5, DiscountController_12, CartController_2, OrderController_3, CartItemController_4, ProductReviewController_7, SocialAuthController_0, "/")

  def withPrefix(addPrefix: String): Routes = {
    val prefix = play.api.routing.Router.concatPrefix(addPrefix, this.prefix)
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, HomeController_11, Assets_10, ProductController_8, CategoryController_6, UserController_9, UserPaymentController_1, UserAddressController_5, DiscountController_12, CartController_2, OrderController_3, CartItemController_4, ProductReviewController_7, SocialAuthController_0, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.HomeController.index()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/""" + "$" + """file<.+>""", """controllers.Assets.versioned(path:String = "/public", file:Asset)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """addproduct""", """controllers.ProductController.addProduct"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """addproducthandle""", """controllers.ProductController.addProductHandle"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """products""", """controllers.ProductController.getProducts"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """product/""" + "$" + """id<[^/]+>""", """controllers.ProductController.getProduct(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """product/del/""" + "$" + """id<[^/]+>""", """controllers.ProductController.deleteProduct(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """product/up/""" + "$" + """id<[^/]+>""", """controllers.ProductController.updateProduct(id:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """updateproducthandle""", """controllers.ProductController.updateProductHandle"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/products""", """controllers.ProductController.getProductsJson"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/product/""" + "$" + """id<[^/]+>""", """controllers.ProductController.getProductJson(id:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/product""", """controllers.ProductController.addProductJson"""),
    ("""DELETE""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/product/""" + "$" + """id<[^/]+>""", """controllers.ProductController.deleteProductJson(id:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/product_update""", """controllers.ProductController.updateProductJson"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """addcategory""", """controllers.CategoryController.addCategory"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """addcategoryhandle""", """controllers.CategoryController.addCategoryHandle"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """categories""", """controllers.CategoryController.getCategories"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """category/""" + "$" + """id<[^/]+>""", """controllers.CategoryController.getCategory(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """category/del/""" + "$" + """id<[^/]+>""", """controllers.CategoryController.deleteCategory(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """category/up/""" + "$" + """id<[^/]+>""", """controllers.CategoryController.updateCategory(id:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """updatecategoryhandle""", """controllers.CategoryController.updateCategoryHandle"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/categories""", """controllers.CategoryController.getCategoriesJson"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/category/""" + "$" + """id<[^/]+>""", """controllers.CategoryController.getCategoryJson(id:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/category""", """controllers.CategoryController.addCategoryJson"""),
    ("""DELETE""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/category/""" + "$" + """id<[^/]+>""", """controllers.CategoryController.deleteCategoryJson(id:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/category_update""", """controllers.CategoryController.updateCategoryJson"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """adduser""", """controllers.UserController.addUser"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """adduserhandle""", """controllers.UserController.addUserHandle"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """users""", """controllers.UserController.getUsers"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """user/""" + "$" + """id<[^/]+>""", """controllers.UserController.getUser(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """user/del/""" + "$" + """id<[^/]+>""", """controllers.UserController.deleteUser(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """user/up/""" + "$" + """id<[^/]+>""", """controllers.UserController.updateUser(id:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """updateuserhandle""", """controllers.UserController.updateUserHandle"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/users""", """controllers.UserController.getUsersJson"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/user/""" + "$" + """id<[^/]+>""", """controllers.UserController.getUserJson(id:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/user""", """controllers.UserController.addUserJson"""),
    ("""DELETE""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/user/""" + "$" + """id<[^/]+>""", """controllers.UserController.deleteUserJson(id:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/user_update""", """controllers.UserController.updateUserJson"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """adduserPayment""", """controllers.UserPaymentController.addUserPayment"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """adduserPaymentHandle""", """controllers.UserPaymentController.addUserPaymentHandle"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """userPayments""", """controllers.UserPaymentController.getUserPayments"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """userPayment/""" + "$" + """id<[^/]+>""", """controllers.UserPaymentController.getUserPayment(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """userPayment/del/""" + "$" + """id<[^/]+>""", """controllers.UserPaymentController.deleteUserPayment(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """userPayment/up/""" + "$" + """id<[^/]+>""", """controllers.UserPaymentController.updateUserPayment(id:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """updateuserPaymentHandle""", """controllers.UserPaymentController.updateUserPaymentHandle"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/usersPayments""", """controllers.UserPaymentController.getUserPaymentsJson"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/usersPayment""" + "$" + """id<[^/]+>""", """controllers.UserPaymentController.getUserPaymentJson(id:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/usersPayment""", """controllers.UserPaymentController.addUserPaymentJson"""),
    ("""DELETE""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/usersPayment/""" + "$" + """id<[^/]+>""", """controllers.UserPaymentController.deleteUserPaymentJson(id:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/usersPayment_update""", """controllers.UserPaymentController.updateUserPaymentJson"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """adduserAddress""", """controllers.UserAddressController.addUserAddress"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """adduserAddressHandle""", """controllers.UserAddressController.addUserAddressHandle"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """userAddresses""", """controllers.UserAddressController.getUserAddresses"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """userAddress/""" + "$" + """id<[^/]+>""", """controllers.UserAddressController.getUserAddress(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """userAddress/del/""" + "$" + """id<[^/]+>""", """controllers.UserAddressController.deleteUserAddress(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """userAddress/up/""" + "$" + """id<[^/]+>""", """controllers.UserAddressController.updateUserAddress(id:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """updateuserAddress""", """controllers.UserAddressController.updateUserAddressHandle"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/usersAddresses""", """controllers.UserAddressController.getUsersAddressesJson"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/userAddresses/""" + "$" + """id<[^/]+>""", """controllers.UserAddressController.getUserAddressesJson(id:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/userAddres""", """controllers.UserAddressController.adduserAddresJson"""),
    ("""DELETE""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/userAddres/""" + "$" + """id<[^/]+>""", """controllers.UserAddressController.deleteuserAddresJson(id:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/userAddres_update""", """controllers.UserAddressController.updateuserAddrestJson"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """adddiscount""", """controllers.DiscountController.addDiscount"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """adddiscountHandle""", """controllers.DiscountController.addDiscountHandle"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """discounts""", """controllers.DiscountController.getDiscounts"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """discount/""" + "$" + """id<[^/]+>""", """controllers.DiscountController.getDiscount(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """discount/del/""" + "$" + """id<[^/]+>""", """controllers.DiscountController.deleteDiscount(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """discount/up/""" + "$" + """id<[^/]+>""", """controllers.DiscountController.updateDiscount(id:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """updatediscount""", """controllers.DiscountController.updateDiscountHandle"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/discounts""", """controllers.DiscountController.getDiscountsJson"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/discount/""" + "$" + """id<[^/]+>""", """controllers.DiscountController.getDiscountJson(id:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/discount""", """controllers.DiscountController.addDiscountJson"""),
    ("""DELETE""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/discount/""" + "$" + """id<[^/]+>""", """controllers.DiscountController.deleteDiscountJson(id:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/discount_update""", """controllers.DiscountController.updateDiscountJson"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """addcart""", """controllers.CartController.addCart"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """addcartHandle""", """controllers.CartController.addCartHandle"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """carts""", """controllers.CartController.getCarts"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """cart/""" + "$" + """id<[^/]+>""", """controllers.CartController.getCart(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """cart/del/""" + "$" + """id<[^/]+>""", """controllers.CartController.deleteCart(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """cart/up/""" + "$" + """id<[^/]+>""", """controllers.CartController.updateCart(id:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """updatecart""", """controllers.CartController.updateCartHandle()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/carts""", """controllers.CartController.getCartsJson"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/carts/""" + "$" + """id<[^/]+>""", """controllers.CartController.getCartJson(id:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/cart""", """controllers.CartController.addCartJson"""),
    ("""DELETE""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/cart/""" + "$" + """id<[^/]+>""", """controllers.CartController.deleteCartJson(id:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/cart_update""", """controllers.CartController.updateCartJson"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """addorder""", """controllers.OrderController.addOrder"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """orderHandle""", """controllers.OrderController.addOrderHandle"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """orders""", """controllers.OrderController.getOrders"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """order/""" + "$" + """id<[^/]+>""", """controllers.OrderController.getOrder(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """order/del/""" + "$" + """id<[^/]+>""", """controllers.OrderController.deleteOrder(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """order/up/""" + "$" + """id<[^/]+>""", """controllers.OrderController.updateOrder(id:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """updateorder""", """controllers.OrderController.updateOrderHandle"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/orders""", """controllers.OrderController.getOrdersJson"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/order/""" + "$" + """id<[^/]+>""", """controllers.OrderController.getOrderJson(id:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/order""", """controllers.OrderController.addOrderJson"""),
    ("""DELETE""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/order/""" + "$" + """id<[^/]+>""", """controllers.OrderController.deleteOrderJson(id:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/order_update""", """controllers.OrderController.updateOrderJson"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """addcartItem""", """controllers.CartItemController.addCartItem"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """addcartItemHandle""", """controllers.CartItemController.addCartItemHandle"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """cartItems""", """controllers.CartItemController.getCartItems"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """cartItem/""" + "$" + """id<[^/]+>""", """controllers.CartItemController.getCartItem(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """cartItem/del/""" + "$" + """id<[^/]+>""", """controllers.CartItemController.deleteCartItem(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """cartItem/up/""" + "$" + """id<[^/]+>""", """controllers.CartItemController.updateCartItem(id:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """updatecartItem""", """controllers.CartItemController.updateCartItemHandle"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/cartsItems""", """controllers.CartItemController.getCartsItemsJson"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/cartItems/""" + "$" + """id<[^/]+>""", """controllers.CartItemController.getCarItemsJson(id:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/cartItem""", """controllers.CartItemController.addCarItemJson"""),
    ("""DELETE""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/cartItem/""" + "$" + """id<[^/]+>""", """controllers.CartItemController.deleteCarItemJson(id:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/cartItem_update""", """controllers.CartItemController.updateCarItemJson"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """productReview""", """controllers.ProductReviewController.addProductReview"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """productReviewHandle""", """controllers.ProductReviewController.addProductReviewHandle"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """productReviews""", """controllers.ProductReviewController.getProductReviews"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """productReview/""" + "$" + """id<[^/]+>""", """controllers.ProductReviewController.getProductReview(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """productReview/del/""" + "$" + """id<[^/]+>""", """controllers.ProductReviewController.deleteProductReview(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """productReview/up/""" + "$" + """id<[^/]+>""", """controllers.ProductReviewController.updateProductReview(id:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """updateproductReview""", """controllers.ProductReviewController.updateProductReviewHandle"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/productsReviews""", """controllers.ProductReviewController.getProductdReviewsJson"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/productReviews/""" + "$" + """id<[^/]+>""", """controllers.ProductReviewController.getProductReviewsJson(id:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/productReview""", """controllers.ProductReviewController.addProductReviewJson"""),
    ("""DELETE""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/productReview/""" + "$" + """id<[^/]+>""", """controllers.ProductReviewController.deleteProductReviewJson(id:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/productReview_update""", """controllers.ProductReviewController.updateProductReviewJson"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """authenticate/""" + "$" + """provider<[^/]+>""", """controllers.SocialAuthController.authenticate(provider:String)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:2
  private[this] lazy val controllers_HomeController_index0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_HomeController_index0_invoker = createInvoker(
    HomeController_11.index(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "index",
      Nil,
      "GET",
      this.prefix + """""",
      """ home""",
      Seq()
    )
  )

  // @LINE:5
  private[this] lazy val controllers_Assets_versioned1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned1_invoker = createInvoker(
    Assets_10.versioned(fakeValue[String], fakeValue[Asset]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "versioned",
      Seq(classOf[String], classOf[Asset]),
      "GET",
      this.prefix + """assets/""" + "$" + """file<.+>""",
      """ Map static resources from the /public folder to the /assets URL path""",
      Seq()
    )
  )

  // @LINE:8
  private[this] lazy val controllers_ProductController_addProduct2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addproduct")))
  )
  private[this] lazy val controllers_ProductController_addProduct2_invoker = createInvoker(
    ProductController_8.addProduct,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ProductController",
      "addProduct",
      Nil,
      "GET",
      this.prefix + """addproduct""",
      """ products routes (ok)""",
      Seq()
    )
  )

  // @LINE:9
  private[this] lazy val controllers_ProductController_addProductHandle3_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addproducthandle")))
  )
  private[this] lazy val controllers_ProductController_addProductHandle3_invoker = createInvoker(
    ProductController_8.addProductHandle,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ProductController",
      "addProductHandle",
      Nil,
      "POST",
      this.prefix + """addproducthandle""",
      """""",
      Seq()
    )
  )

  // @LINE:10
  private[this] lazy val controllers_ProductController_getProducts4_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("products")))
  )
  private[this] lazy val controllers_ProductController_getProducts4_invoker = createInvoker(
    ProductController_8.getProducts,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ProductController",
      "getProducts",
      Nil,
      "GET",
      this.prefix + """products""",
      """""",
      Seq()
    )
  )

  // @LINE:11
  private[this] lazy val controllers_ProductController_getProduct5_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("product/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ProductController_getProduct5_invoker = createInvoker(
    ProductController_8.getProduct(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ProductController",
      "getProduct",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """product/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:12
  private[this] lazy val controllers_ProductController_deleteProduct6_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("product/del/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ProductController_deleteProduct6_invoker = createInvoker(
    ProductController_8.deleteProduct(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ProductController",
      "deleteProduct",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """product/del/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:13
  private[this] lazy val controllers_ProductController_updateProduct7_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("product/up/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ProductController_updateProduct7_invoker = createInvoker(
    ProductController_8.updateProduct(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ProductController",
      "updateProduct",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """product/up/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:14
  private[this] lazy val controllers_ProductController_updateProductHandle8_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("updateproducthandle")))
  )
  private[this] lazy val controllers_ProductController_updateProductHandle8_invoker = createInvoker(
    ProductController_8.updateProductHandle,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ProductController",
      "updateProductHandle",
      Nil,
      "POST",
      this.prefix + """updateproducthandle""",
      """""",
      Seq()
    )
  )

  // @LINE:16
  private[this] lazy val controllers_ProductController_getProductsJson9_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/products")))
  )
  private[this] lazy val controllers_ProductController_getProductsJson9_invoker = createInvoker(
    ProductController_8.getProductsJson,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ProductController",
      "getProductsJson",
      Nil,
      "GET",
      this.prefix + """api/products""",
      """""",
      Seq()
    )
  )

  // @LINE:17
  private[this] lazy val controllers_ProductController_getProductJson10_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/product/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ProductController_getProductJson10_invoker = createInvoker(
    ProductController_8.getProductJson(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ProductController",
      "getProductJson",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """api/product/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:18
  private[this] lazy val controllers_ProductController_addProductJson11_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/product")))
  )
  private[this] lazy val controllers_ProductController_addProductJson11_invoker = createInvoker(
    ProductController_8.addProductJson,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ProductController",
      "addProductJson",
      Nil,
      "POST",
      this.prefix + """api/product""",
      """""",
      Seq()
    )
  )

  // @LINE:19
  private[this] lazy val controllers_ProductController_deleteProductJson12_route = Route("DELETE",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/product/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ProductController_deleteProductJson12_invoker = createInvoker(
    ProductController_8.deleteProductJson(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ProductController",
      "deleteProductJson",
      Seq(classOf[Long]),
      "DELETE",
      this.prefix + """api/product/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:20
  private[this] lazy val controllers_ProductController_updateProductJson13_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/product_update")))
  )
  private[this] lazy val controllers_ProductController_updateProductJson13_invoker = createInvoker(
    ProductController_8.updateProductJson,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ProductController",
      "updateProductJson",
      Nil,
      "POST",
      this.prefix + """api/product_update""",
      """""",
      Seq()
    )
  )

  // @LINE:23
  private[this] lazy val controllers_CategoryController_addCategory14_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addcategory")))
  )
  private[this] lazy val controllers_CategoryController_addCategory14_invoker = createInvoker(
    CategoryController_6.addCategory,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.CategoryController",
      "addCategory",
      Nil,
      "GET",
      this.prefix + """addcategory""",
      """ category routes (ok)""",
      Seq()
    )
  )

  // @LINE:24
  private[this] lazy val controllers_CategoryController_addCategoryHandle15_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addcategoryhandle")))
  )
  private[this] lazy val controllers_CategoryController_addCategoryHandle15_invoker = createInvoker(
    CategoryController_6.addCategoryHandle,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.CategoryController",
      "addCategoryHandle",
      Nil,
      "POST",
      this.prefix + """addcategoryhandle""",
      """""",
      Seq()
    )
  )

  // @LINE:25
  private[this] lazy val controllers_CategoryController_getCategories16_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("categories")))
  )
  private[this] lazy val controllers_CategoryController_getCategories16_invoker = createInvoker(
    CategoryController_6.getCategories,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.CategoryController",
      "getCategories",
      Nil,
      "GET",
      this.prefix + """categories""",
      """""",
      Seq()
    )
  )

  // @LINE:26
  private[this] lazy val controllers_CategoryController_getCategory17_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("category/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_CategoryController_getCategory17_invoker = createInvoker(
    CategoryController_6.getCategory(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.CategoryController",
      "getCategory",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """category/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:27
  private[this] lazy val controllers_CategoryController_deleteCategory18_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("category/del/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_CategoryController_deleteCategory18_invoker = createInvoker(
    CategoryController_6.deleteCategory(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.CategoryController",
      "deleteCategory",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """category/del/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:28
  private[this] lazy val controllers_CategoryController_updateCategory19_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("category/up/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_CategoryController_updateCategory19_invoker = createInvoker(
    CategoryController_6.updateCategory(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.CategoryController",
      "updateCategory",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """category/up/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:29
  private[this] lazy val controllers_CategoryController_updateCategoryHandle20_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("updatecategoryhandle")))
  )
  private[this] lazy val controllers_CategoryController_updateCategoryHandle20_invoker = createInvoker(
    CategoryController_6.updateCategoryHandle,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.CategoryController",
      "updateCategoryHandle",
      Nil,
      "POST",
      this.prefix + """updatecategoryhandle""",
      """""",
      Seq()
    )
  )

  // @LINE:31
  private[this] lazy val controllers_CategoryController_getCategoriesJson21_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/categories")))
  )
  private[this] lazy val controllers_CategoryController_getCategoriesJson21_invoker = createInvoker(
    CategoryController_6.getCategoriesJson,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.CategoryController",
      "getCategoriesJson",
      Nil,
      "GET",
      this.prefix + """api/categories""",
      """""",
      Seq()
    )
  )

  // @LINE:32
  private[this] lazy val controllers_CategoryController_getCategoryJson22_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/category/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_CategoryController_getCategoryJson22_invoker = createInvoker(
    CategoryController_6.getCategoryJson(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.CategoryController",
      "getCategoryJson",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """api/category/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:33
  private[this] lazy val controllers_CategoryController_addCategoryJson23_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/category")))
  )
  private[this] lazy val controllers_CategoryController_addCategoryJson23_invoker = createInvoker(
    CategoryController_6.addCategoryJson,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.CategoryController",
      "addCategoryJson",
      Nil,
      "POST",
      this.prefix + """api/category""",
      """""",
      Seq()
    )
  )

  // @LINE:34
  private[this] lazy val controllers_CategoryController_deleteCategoryJson24_route = Route("DELETE",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/category/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_CategoryController_deleteCategoryJson24_invoker = createInvoker(
    CategoryController_6.deleteCategoryJson(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.CategoryController",
      "deleteCategoryJson",
      Seq(classOf[Long]),
      "DELETE",
      this.prefix + """api/category/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:35
  private[this] lazy val controllers_CategoryController_updateCategoryJson25_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/category_update")))
  )
  private[this] lazy val controllers_CategoryController_updateCategoryJson25_invoker = createInvoker(
    CategoryController_6.updateCategoryJson,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.CategoryController",
      "updateCategoryJson",
      Nil,
      "POST",
      this.prefix + """api/category_update""",
      """""",
      Seq()
    )
  )

  // @LINE:38
  private[this] lazy val controllers_UserController_addUser26_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("adduser")))
  )
  private[this] lazy val controllers_UserController_addUser26_invoker = createInvoker(
    UserController_9.addUser,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UserController",
      "addUser",
      Nil,
      "GET",
      this.prefix + """adduser""",
      """ user routes (ok)""",
      Seq()
    )
  )

  // @LINE:39
  private[this] lazy val controllers_UserController_addUserHandle27_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("adduserhandle")))
  )
  private[this] lazy val controllers_UserController_addUserHandle27_invoker = createInvoker(
    UserController_9.addUserHandle,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UserController",
      "addUserHandle",
      Nil,
      "POST",
      this.prefix + """adduserhandle""",
      """""",
      Seq()
    )
  )

  // @LINE:40
  private[this] lazy val controllers_UserController_getUsers28_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("users")))
  )
  private[this] lazy val controllers_UserController_getUsers28_invoker = createInvoker(
    UserController_9.getUsers,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UserController",
      "getUsers",
      Nil,
      "GET",
      this.prefix + """users""",
      """""",
      Seq()
    )
  )

  // @LINE:41
  private[this] lazy val controllers_UserController_getUser29_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("user/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_UserController_getUser29_invoker = createInvoker(
    UserController_9.getUser(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UserController",
      "getUser",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """user/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:42
  private[this] lazy val controllers_UserController_deleteUser30_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("user/del/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_UserController_deleteUser30_invoker = createInvoker(
    UserController_9.deleteUser(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UserController",
      "deleteUser",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """user/del/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:43
  private[this] lazy val controllers_UserController_updateUser31_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("user/up/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_UserController_updateUser31_invoker = createInvoker(
    UserController_9.updateUser(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UserController",
      "updateUser",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """user/up/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:44
  private[this] lazy val controllers_UserController_updateUserHandle32_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("updateuserhandle")))
  )
  private[this] lazy val controllers_UserController_updateUserHandle32_invoker = createInvoker(
    UserController_9.updateUserHandle,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UserController",
      "updateUserHandle",
      Nil,
      "POST",
      this.prefix + """updateuserhandle""",
      """""",
      Seq()
    )
  )

  // @LINE:46
  private[this] lazy val controllers_UserController_getUsersJson33_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/users")))
  )
  private[this] lazy val controllers_UserController_getUsersJson33_invoker = createInvoker(
    UserController_9.getUsersJson,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UserController",
      "getUsersJson",
      Nil,
      "GET",
      this.prefix + """api/users""",
      """""",
      Seq()
    )
  )

  // @LINE:47
  private[this] lazy val controllers_UserController_getUserJson34_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/user/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_UserController_getUserJson34_invoker = createInvoker(
    UserController_9.getUserJson(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UserController",
      "getUserJson",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """api/user/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:48
  private[this] lazy val controllers_UserController_addUserJson35_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/user")))
  )
  private[this] lazy val controllers_UserController_addUserJson35_invoker = createInvoker(
    UserController_9.addUserJson,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UserController",
      "addUserJson",
      Nil,
      "POST",
      this.prefix + """api/user""",
      """""",
      Seq()
    )
  )

  // @LINE:49
  private[this] lazy val controllers_UserController_deleteUserJson36_route = Route("DELETE",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/user/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_UserController_deleteUserJson36_invoker = createInvoker(
    UserController_9.deleteUserJson(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UserController",
      "deleteUserJson",
      Seq(classOf[Long]),
      "DELETE",
      this.prefix + """api/user/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:50
  private[this] lazy val controllers_UserController_updateUserJson37_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/user_update")))
  )
  private[this] lazy val controllers_UserController_updateUserJson37_invoker = createInvoker(
    UserController_9.updateUserJson,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UserController",
      "updateUserJson",
      Nil,
      "POST",
      this.prefix + """api/user_update""",
      """""",
      Seq()
    )
  )

  // @LINE:53
  private[this] lazy val controllers_UserPaymentController_addUserPayment38_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("adduserPayment")))
  )
  private[this] lazy val controllers_UserPaymentController_addUserPayment38_invoker = createInvoker(
    UserPaymentController_1.addUserPayment,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UserPaymentController",
      "addUserPayment",
      Nil,
      "GET",
      this.prefix + """adduserPayment""",
      """ userPayment data (ok)""",
      Seq()
    )
  )

  // @LINE:54
  private[this] lazy val controllers_UserPaymentController_addUserPaymentHandle39_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("adduserPaymentHandle")))
  )
  private[this] lazy val controllers_UserPaymentController_addUserPaymentHandle39_invoker = createInvoker(
    UserPaymentController_1.addUserPaymentHandle,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UserPaymentController",
      "addUserPaymentHandle",
      Nil,
      "POST",
      this.prefix + """adduserPaymentHandle""",
      """""",
      Seq()
    )
  )

  // @LINE:55
  private[this] lazy val controllers_UserPaymentController_getUserPayments40_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("userPayments")))
  )
  private[this] lazy val controllers_UserPaymentController_getUserPayments40_invoker = createInvoker(
    UserPaymentController_1.getUserPayments,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UserPaymentController",
      "getUserPayments",
      Nil,
      "GET",
      this.prefix + """userPayments""",
      """""",
      Seq()
    )
  )

  // @LINE:56
  private[this] lazy val controllers_UserPaymentController_getUserPayment41_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("userPayment/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_UserPaymentController_getUserPayment41_invoker = createInvoker(
    UserPaymentController_1.getUserPayment(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UserPaymentController",
      "getUserPayment",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """userPayment/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:57
  private[this] lazy val controllers_UserPaymentController_deleteUserPayment42_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("userPayment/del/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_UserPaymentController_deleteUserPayment42_invoker = createInvoker(
    UserPaymentController_1.deleteUserPayment(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UserPaymentController",
      "deleteUserPayment",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """userPayment/del/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:58
  private[this] lazy val controllers_UserPaymentController_updateUserPayment43_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("userPayment/up/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_UserPaymentController_updateUserPayment43_invoker = createInvoker(
    UserPaymentController_1.updateUserPayment(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UserPaymentController",
      "updateUserPayment",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """userPayment/up/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:59
  private[this] lazy val controllers_UserPaymentController_updateUserPaymentHandle44_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("updateuserPaymentHandle")))
  )
  private[this] lazy val controllers_UserPaymentController_updateUserPaymentHandle44_invoker = createInvoker(
    UserPaymentController_1.updateUserPaymentHandle,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UserPaymentController",
      "updateUserPaymentHandle",
      Nil,
      "POST",
      this.prefix + """updateuserPaymentHandle""",
      """""",
      Seq()
    )
  )

  // @LINE:61
  private[this] lazy val controllers_UserPaymentController_getUserPaymentsJson45_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/usersPayments")))
  )
  private[this] lazy val controllers_UserPaymentController_getUserPaymentsJson45_invoker = createInvoker(
    UserPaymentController_1.getUserPaymentsJson,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UserPaymentController",
      "getUserPaymentsJson",
      Nil,
      "GET",
      this.prefix + """api/usersPayments""",
      """""",
      Seq()
    )
  )

  // @LINE:62
  private[this] lazy val controllers_UserPaymentController_getUserPaymentJson46_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/usersPayment"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_UserPaymentController_getUserPaymentJson46_invoker = createInvoker(
    UserPaymentController_1.getUserPaymentJson(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UserPaymentController",
      "getUserPaymentJson",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """api/usersPayment""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:63
  private[this] lazy val controllers_UserPaymentController_addUserPaymentJson47_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/usersPayment")))
  )
  private[this] lazy val controllers_UserPaymentController_addUserPaymentJson47_invoker = createInvoker(
    UserPaymentController_1.addUserPaymentJson,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UserPaymentController",
      "addUserPaymentJson",
      Nil,
      "POST",
      this.prefix + """api/usersPayment""",
      """""",
      Seq()
    )
  )

  // @LINE:64
  private[this] lazy val controllers_UserPaymentController_deleteUserPaymentJson48_route = Route("DELETE",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/usersPayment/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_UserPaymentController_deleteUserPaymentJson48_invoker = createInvoker(
    UserPaymentController_1.deleteUserPaymentJson(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UserPaymentController",
      "deleteUserPaymentJson",
      Seq(classOf[Long]),
      "DELETE",
      this.prefix + """api/usersPayment/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:65
  private[this] lazy val controllers_UserPaymentController_updateUserPaymentJson49_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/usersPayment_update")))
  )
  private[this] lazy val controllers_UserPaymentController_updateUserPaymentJson49_invoker = createInvoker(
    UserPaymentController_1.updateUserPaymentJson,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UserPaymentController",
      "updateUserPaymentJson",
      Nil,
      "POST",
      this.prefix + """api/usersPayment_update""",
      """""",
      Seq()
    )
  )

  // @LINE:68
  private[this] lazy val controllers_UserAddressController_addUserAddress50_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("adduserAddress")))
  )
  private[this] lazy val controllers_UserAddressController_addUserAddress50_invoker = createInvoker(
    UserAddressController_5.addUserAddress,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UserAddressController",
      "addUserAddress",
      Nil,
      "GET",
      this.prefix + """adduserAddress""",
      """ userAddress (ok)""",
      Seq()
    )
  )

  // @LINE:69
  private[this] lazy val controllers_UserAddressController_addUserAddressHandle51_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("adduserAddressHandle")))
  )
  private[this] lazy val controllers_UserAddressController_addUserAddressHandle51_invoker = createInvoker(
    UserAddressController_5.addUserAddressHandle,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UserAddressController",
      "addUserAddressHandle",
      Nil,
      "POST",
      this.prefix + """adduserAddressHandle""",
      """""",
      Seq()
    )
  )

  // @LINE:70
  private[this] lazy val controllers_UserAddressController_getUserAddresses52_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("userAddresses")))
  )
  private[this] lazy val controllers_UserAddressController_getUserAddresses52_invoker = createInvoker(
    UserAddressController_5.getUserAddresses,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UserAddressController",
      "getUserAddresses",
      Nil,
      "GET",
      this.prefix + """userAddresses""",
      """""",
      Seq()
    )
  )

  // @LINE:71
  private[this] lazy val controllers_UserAddressController_getUserAddress53_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("userAddress/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_UserAddressController_getUserAddress53_invoker = createInvoker(
    UserAddressController_5.getUserAddress(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UserAddressController",
      "getUserAddress",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """userAddress/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:72
  private[this] lazy val controllers_UserAddressController_deleteUserAddress54_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("userAddress/del/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_UserAddressController_deleteUserAddress54_invoker = createInvoker(
    UserAddressController_5.deleteUserAddress(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UserAddressController",
      "deleteUserAddress",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """userAddress/del/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:73
  private[this] lazy val controllers_UserAddressController_updateUserAddress55_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("userAddress/up/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_UserAddressController_updateUserAddress55_invoker = createInvoker(
    UserAddressController_5.updateUserAddress(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UserAddressController",
      "updateUserAddress",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """userAddress/up/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:74
  private[this] lazy val controllers_UserAddressController_updateUserAddressHandle56_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("updateuserAddress")))
  )
  private[this] lazy val controllers_UserAddressController_updateUserAddressHandle56_invoker = createInvoker(
    UserAddressController_5.updateUserAddressHandle,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UserAddressController",
      "updateUserAddressHandle",
      Nil,
      "POST",
      this.prefix + """updateuserAddress""",
      """""",
      Seq()
    )
  )

  // @LINE:76
  private[this] lazy val controllers_UserAddressController_getUsersAddressesJson57_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/usersAddresses")))
  )
  private[this] lazy val controllers_UserAddressController_getUsersAddressesJson57_invoker = createInvoker(
    UserAddressController_5.getUsersAddressesJson,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UserAddressController",
      "getUsersAddressesJson",
      Nil,
      "GET",
      this.prefix + """api/usersAddresses""",
      """""",
      Seq()
    )
  )

  // @LINE:77
  private[this] lazy val controllers_UserAddressController_getUserAddressesJson58_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/userAddresses/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_UserAddressController_getUserAddressesJson58_invoker = createInvoker(
    UserAddressController_5.getUserAddressesJson(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UserAddressController",
      "getUserAddressesJson",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """api/userAddresses/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:78
  private[this] lazy val controllers_UserAddressController_adduserAddresJson59_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/userAddres")))
  )
  private[this] lazy val controllers_UserAddressController_adduserAddresJson59_invoker = createInvoker(
    UserAddressController_5.adduserAddresJson,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UserAddressController",
      "adduserAddresJson",
      Nil,
      "POST",
      this.prefix + """api/userAddres""",
      """""",
      Seq()
    )
  )

  // @LINE:79
  private[this] lazy val controllers_UserAddressController_deleteuserAddresJson60_route = Route("DELETE",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/userAddres/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_UserAddressController_deleteuserAddresJson60_invoker = createInvoker(
    UserAddressController_5.deleteuserAddresJson(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UserAddressController",
      "deleteuserAddresJson",
      Seq(classOf[Long]),
      "DELETE",
      this.prefix + """api/userAddres/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:80
  private[this] lazy val controllers_UserAddressController_updateuserAddrestJson61_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/userAddres_update")))
  )
  private[this] lazy val controllers_UserAddressController_updateuserAddrestJson61_invoker = createInvoker(
    UserAddressController_5.updateuserAddrestJson,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UserAddressController",
      "updateuserAddrestJson",
      Nil,
      "POST",
      this.prefix + """api/userAddres_update""",
      """""",
      Seq()
    )
  )

  // @LINE:83
  private[this] lazy val controllers_DiscountController_addDiscount62_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("adddiscount")))
  )
  private[this] lazy val controllers_DiscountController_addDiscount62_invoker = createInvoker(
    DiscountController_12.addDiscount,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.DiscountController",
      "addDiscount",
      Nil,
      "GET",
      this.prefix + """adddiscount""",
      """ discount (ok)""",
      Seq()
    )
  )

  // @LINE:84
  private[this] lazy val controllers_DiscountController_addDiscountHandle63_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("adddiscountHandle")))
  )
  private[this] lazy val controllers_DiscountController_addDiscountHandle63_invoker = createInvoker(
    DiscountController_12.addDiscountHandle,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.DiscountController",
      "addDiscountHandle",
      Nil,
      "POST",
      this.prefix + """adddiscountHandle""",
      """""",
      Seq()
    )
  )

  // @LINE:85
  private[this] lazy val controllers_DiscountController_getDiscounts64_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("discounts")))
  )
  private[this] lazy val controllers_DiscountController_getDiscounts64_invoker = createInvoker(
    DiscountController_12.getDiscounts,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.DiscountController",
      "getDiscounts",
      Nil,
      "GET",
      this.prefix + """discounts""",
      """""",
      Seq()
    )
  )

  // @LINE:86
  private[this] lazy val controllers_DiscountController_getDiscount65_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("discount/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_DiscountController_getDiscount65_invoker = createInvoker(
    DiscountController_12.getDiscount(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.DiscountController",
      "getDiscount",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """discount/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:87
  private[this] lazy val controllers_DiscountController_deleteDiscount66_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("discount/del/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_DiscountController_deleteDiscount66_invoker = createInvoker(
    DiscountController_12.deleteDiscount(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.DiscountController",
      "deleteDiscount",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """discount/del/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:88
  private[this] lazy val controllers_DiscountController_updateDiscount67_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("discount/up/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_DiscountController_updateDiscount67_invoker = createInvoker(
    DiscountController_12.updateDiscount(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.DiscountController",
      "updateDiscount",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """discount/up/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:89
  private[this] lazy val controllers_DiscountController_updateDiscountHandle68_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("updatediscount")))
  )
  private[this] lazy val controllers_DiscountController_updateDiscountHandle68_invoker = createInvoker(
    DiscountController_12.updateDiscountHandle,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.DiscountController",
      "updateDiscountHandle",
      Nil,
      "POST",
      this.prefix + """updatediscount""",
      """""",
      Seq()
    )
  )

  // @LINE:91
  private[this] lazy val controllers_DiscountController_getDiscountsJson69_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/discounts")))
  )
  private[this] lazy val controllers_DiscountController_getDiscountsJson69_invoker = createInvoker(
    DiscountController_12.getDiscountsJson,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.DiscountController",
      "getDiscountsJson",
      Nil,
      "GET",
      this.prefix + """api/discounts""",
      """""",
      Seq()
    )
  )

  // @LINE:92
  private[this] lazy val controllers_DiscountController_getDiscountJson70_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/discount/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_DiscountController_getDiscountJson70_invoker = createInvoker(
    DiscountController_12.getDiscountJson(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.DiscountController",
      "getDiscountJson",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """api/discount/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:93
  private[this] lazy val controllers_DiscountController_addDiscountJson71_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/discount")))
  )
  private[this] lazy val controllers_DiscountController_addDiscountJson71_invoker = createInvoker(
    DiscountController_12.addDiscountJson,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.DiscountController",
      "addDiscountJson",
      Nil,
      "POST",
      this.prefix + """api/discount""",
      """""",
      Seq()
    )
  )

  // @LINE:94
  private[this] lazy val controllers_DiscountController_deleteDiscountJson72_route = Route("DELETE",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/discount/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_DiscountController_deleteDiscountJson72_invoker = createInvoker(
    DiscountController_12.deleteDiscountJson(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.DiscountController",
      "deleteDiscountJson",
      Seq(classOf[Long]),
      "DELETE",
      this.prefix + """api/discount/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:95
  private[this] lazy val controllers_DiscountController_updateDiscountJson73_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/discount_update")))
  )
  private[this] lazy val controllers_DiscountController_updateDiscountJson73_invoker = createInvoker(
    DiscountController_12.updateDiscountJson,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.DiscountController",
      "updateDiscountJson",
      Nil,
      "POST",
      this.prefix + """api/discount_update""",
      """""",
      Seq()
    )
  )

  // @LINE:98
  private[this] lazy val controllers_CartController_addCart74_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addcart")))
  )
  private[this] lazy val controllers_CartController_addCart74_invoker = createInvoker(
    CartController_2.addCart,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.CartController",
      "addCart",
      Nil,
      "GET",
      this.prefix + """addcart""",
      """ cart routes (ok)""",
      Seq()
    )
  )

  // @LINE:99
  private[this] lazy val controllers_CartController_addCartHandle75_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addcartHandle")))
  )
  private[this] lazy val controllers_CartController_addCartHandle75_invoker = createInvoker(
    CartController_2.addCartHandle,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.CartController",
      "addCartHandle",
      Nil,
      "POST",
      this.prefix + """addcartHandle""",
      """""",
      Seq()
    )
  )

  // @LINE:100
  private[this] lazy val controllers_CartController_getCarts76_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("carts")))
  )
  private[this] lazy val controllers_CartController_getCarts76_invoker = createInvoker(
    CartController_2.getCarts,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.CartController",
      "getCarts",
      Nil,
      "GET",
      this.prefix + """carts""",
      """""",
      Seq()
    )
  )

  // @LINE:101
  private[this] lazy val controllers_CartController_getCart77_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("cart/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_CartController_getCart77_invoker = createInvoker(
    CartController_2.getCart(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.CartController",
      "getCart",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """cart/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:102
  private[this] lazy val controllers_CartController_deleteCart78_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("cart/del/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_CartController_deleteCart78_invoker = createInvoker(
    CartController_2.deleteCart(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.CartController",
      "deleteCart",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """cart/del/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:103
  private[this] lazy val controllers_CartController_updateCart79_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("cart/up/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_CartController_updateCart79_invoker = createInvoker(
    CartController_2.updateCart(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.CartController",
      "updateCart",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """cart/up/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:104
  private[this] lazy val controllers_CartController_updateCartHandle80_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("updatecart")))
  )
  private[this] lazy val controllers_CartController_updateCartHandle80_invoker = createInvoker(
    CartController_2.updateCartHandle(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.CartController",
      "updateCartHandle",
      Nil,
      "POST",
      this.prefix + """updatecart""",
      """""",
      Seq()
    )
  )

  // @LINE:106
  private[this] lazy val controllers_CartController_getCartsJson81_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/carts")))
  )
  private[this] lazy val controllers_CartController_getCartsJson81_invoker = createInvoker(
    CartController_2.getCartsJson,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.CartController",
      "getCartsJson",
      Nil,
      "GET",
      this.prefix + """api/carts""",
      """""",
      Seq()
    )
  )

  // @LINE:107
  private[this] lazy val controllers_CartController_getCartJson82_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/carts/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_CartController_getCartJson82_invoker = createInvoker(
    CartController_2.getCartJson(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.CartController",
      "getCartJson",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """api/carts/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:108
  private[this] lazy val controllers_CartController_addCartJson83_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/cart")))
  )
  private[this] lazy val controllers_CartController_addCartJson83_invoker = createInvoker(
    CartController_2.addCartJson,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.CartController",
      "addCartJson",
      Nil,
      "POST",
      this.prefix + """api/cart""",
      """""",
      Seq()
    )
  )

  // @LINE:109
  private[this] lazy val controllers_CartController_deleteCartJson84_route = Route("DELETE",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/cart/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_CartController_deleteCartJson84_invoker = createInvoker(
    CartController_2.deleteCartJson(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.CartController",
      "deleteCartJson",
      Seq(classOf[Long]),
      "DELETE",
      this.prefix + """api/cart/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:110
  private[this] lazy val controllers_CartController_updateCartJson85_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/cart_update")))
  )
  private[this] lazy val controllers_CartController_updateCartJson85_invoker = createInvoker(
    CartController_2.updateCartJson,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.CartController",
      "updateCartJson",
      Nil,
      "POST",
      this.prefix + """api/cart_update""",
      """""",
      Seq()
    )
  )

  // @LINE:113
  private[this] lazy val controllers_OrderController_addOrder86_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addorder")))
  )
  private[this] lazy val controllers_OrderController_addOrder86_invoker = createInvoker(
    OrderController_3.addOrder,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.OrderController",
      "addOrder",
      Nil,
      "GET",
      this.prefix + """addorder""",
      """ order routes""",
      Seq()
    )
  )

  // @LINE:114
  private[this] lazy val controllers_OrderController_addOrderHandle87_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("orderHandle")))
  )
  private[this] lazy val controllers_OrderController_addOrderHandle87_invoker = createInvoker(
    OrderController_3.addOrderHandle,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.OrderController",
      "addOrderHandle",
      Nil,
      "POST",
      this.prefix + """orderHandle""",
      """""",
      Seq()
    )
  )

  // @LINE:115
  private[this] lazy val controllers_OrderController_getOrders88_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("orders")))
  )
  private[this] lazy val controllers_OrderController_getOrders88_invoker = createInvoker(
    OrderController_3.getOrders,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.OrderController",
      "getOrders",
      Nil,
      "GET",
      this.prefix + """orders""",
      """""",
      Seq()
    )
  )

  // @LINE:116
  private[this] lazy val controllers_OrderController_getOrder89_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("order/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_OrderController_getOrder89_invoker = createInvoker(
    OrderController_3.getOrder(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.OrderController",
      "getOrder",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """order/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:117
  private[this] lazy val controllers_OrderController_deleteOrder90_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("order/del/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_OrderController_deleteOrder90_invoker = createInvoker(
    OrderController_3.deleteOrder(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.OrderController",
      "deleteOrder",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """order/del/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:118
  private[this] lazy val controllers_OrderController_updateOrder91_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("order/up/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_OrderController_updateOrder91_invoker = createInvoker(
    OrderController_3.updateOrder(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.OrderController",
      "updateOrder",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """order/up/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:119
  private[this] lazy val controllers_OrderController_updateOrderHandle92_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("updateorder")))
  )
  private[this] lazy val controllers_OrderController_updateOrderHandle92_invoker = createInvoker(
    OrderController_3.updateOrderHandle,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.OrderController",
      "updateOrderHandle",
      Nil,
      "POST",
      this.prefix + """updateorder""",
      """""",
      Seq()
    )
  )

  // @LINE:121
  private[this] lazy val controllers_OrderController_getOrdersJson93_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/orders")))
  )
  private[this] lazy val controllers_OrderController_getOrdersJson93_invoker = createInvoker(
    OrderController_3.getOrdersJson,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.OrderController",
      "getOrdersJson",
      Nil,
      "GET",
      this.prefix + """api/orders""",
      """""",
      Seq()
    )
  )

  // @LINE:122
  private[this] lazy val controllers_OrderController_getOrderJson94_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/order/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_OrderController_getOrderJson94_invoker = createInvoker(
    OrderController_3.getOrderJson(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.OrderController",
      "getOrderJson",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """api/order/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:123
  private[this] lazy val controllers_OrderController_addOrderJson95_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/order")))
  )
  private[this] lazy val controllers_OrderController_addOrderJson95_invoker = createInvoker(
    OrderController_3.addOrderJson,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.OrderController",
      "addOrderJson",
      Nil,
      "POST",
      this.prefix + """api/order""",
      """""",
      Seq()
    )
  )

  // @LINE:124
  private[this] lazy val controllers_OrderController_deleteOrderJson96_route = Route("DELETE",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/order/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_OrderController_deleteOrderJson96_invoker = createInvoker(
    OrderController_3.deleteOrderJson(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.OrderController",
      "deleteOrderJson",
      Seq(classOf[Long]),
      "DELETE",
      this.prefix + """api/order/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:125
  private[this] lazy val controllers_OrderController_updateOrderJson97_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/order_update")))
  )
  private[this] lazy val controllers_OrderController_updateOrderJson97_invoker = createInvoker(
    OrderController_3.updateOrderJson,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.OrderController",
      "updateOrderJson",
      Nil,
      "POST",
      this.prefix + """api/order_update""",
      """""",
      Seq()
    )
  )

  // @LINE:128
  private[this] lazy val controllers_CartItemController_addCartItem98_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addcartItem")))
  )
  private[this] lazy val controllers_CartItemController_addCartItem98_invoker = createInvoker(
    CartItemController_4.addCartItem,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.CartItemController",
      "addCartItem",
      Nil,
      "GET",
      this.prefix + """addcartItem""",
      """ cartItem routes""",
      Seq()
    )
  )

  // @LINE:129
  private[this] lazy val controllers_CartItemController_addCartItemHandle99_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addcartItemHandle")))
  )
  private[this] lazy val controllers_CartItemController_addCartItemHandle99_invoker = createInvoker(
    CartItemController_4.addCartItemHandle,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.CartItemController",
      "addCartItemHandle",
      Nil,
      "POST",
      this.prefix + """addcartItemHandle""",
      """""",
      Seq()
    )
  )

  // @LINE:130
  private[this] lazy val controllers_CartItemController_getCartItems100_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("cartItems")))
  )
  private[this] lazy val controllers_CartItemController_getCartItems100_invoker = createInvoker(
    CartItemController_4.getCartItems,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.CartItemController",
      "getCartItems",
      Nil,
      "GET",
      this.prefix + """cartItems""",
      """""",
      Seq()
    )
  )

  // @LINE:131
  private[this] lazy val controllers_CartItemController_getCartItem101_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("cartItem/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_CartItemController_getCartItem101_invoker = createInvoker(
    CartItemController_4.getCartItem(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.CartItemController",
      "getCartItem",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """cartItem/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:132
  private[this] lazy val controllers_CartItemController_deleteCartItem102_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("cartItem/del/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_CartItemController_deleteCartItem102_invoker = createInvoker(
    CartItemController_4.deleteCartItem(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.CartItemController",
      "deleteCartItem",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """cartItem/del/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:133
  private[this] lazy val controllers_CartItemController_updateCartItem103_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("cartItem/up/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_CartItemController_updateCartItem103_invoker = createInvoker(
    CartItemController_4.updateCartItem(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.CartItemController",
      "updateCartItem",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """cartItem/up/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:134
  private[this] lazy val controllers_CartItemController_updateCartItemHandle104_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("updatecartItem")))
  )
  private[this] lazy val controllers_CartItemController_updateCartItemHandle104_invoker = createInvoker(
    CartItemController_4.updateCartItemHandle,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.CartItemController",
      "updateCartItemHandle",
      Nil,
      "POST",
      this.prefix + """updatecartItem""",
      """""",
      Seq()
    )
  )

  // @LINE:136
  private[this] lazy val controllers_CartItemController_getCartsItemsJson105_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/cartsItems")))
  )
  private[this] lazy val controllers_CartItemController_getCartsItemsJson105_invoker = createInvoker(
    CartItemController_4.getCartsItemsJson,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.CartItemController",
      "getCartsItemsJson",
      Nil,
      "GET",
      this.prefix + """api/cartsItems""",
      """""",
      Seq()
    )
  )

  // @LINE:137
  private[this] lazy val controllers_CartItemController_getCarItemsJson106_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/cartItems/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_CartItemController_getCarItemsJson106_invoker = createInvoker(
    CartItemController_4.getCarItemsJson(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.CartItemController",
      "getCarItemsJson",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """api/cartItems/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:138
  private[this] lazy val controllers_CartItemController_addCarItemJson107_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/cartItem")))
  )
  private[this] lazy val controllers_CartItemController_addCarItemJson107_invoker = createInvoker(
    CartItemController_4.addCarItemJson,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.CartItemController",
      "addCarItemJson",
      Nil,
      "POST",
      this.prefix + """api/cartItem""",
      """""",
      Seq()
    )
  )

  // @LINE:139
  private[this] lazy val controllers_CartItemController_deleteCarItemJson108_route = Route("DELETE",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/cartItem/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_CartItemController_deleteCarItemJson108_invoker = createInvoker(
    CartItemController_4.deleteCarItemJson(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.CartItemController",
      "deleteCarItemJson",
      Seq(classOf[Long]),
      "DELETE",
      this.prefix + """api/cartItem/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:140
  private[this] lazy val controllers_CartItemController_updateCarItemJson109_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/cartItem_update")))
  )
  private[this] lazy val controllers_CartItemController_updateCarItemJson109_invoker = createInvoker(
    CartItemController_4.updateCarItemJson,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.CartItemController",
      "updateCarItemJson",
      Nil,
      "POST",
      this.prefix + """api/cartItem_update""",
      """""",
      Seq()
    )
  )

  // @LINE:143
  private[this] lazy val controllers_ProductReviewController_addProductReview110_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("productReview")))
  )
  private[this] lazy val controllers_ProductReviewController_addProductReview110_invoker = createInvoker(
    ProductReviewController_7.addProductReview,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ProductReviewController",
      "addProductReview",
      Nil,
      "GET",
      this.prefix + """productReview""",
      """# productReview routes""",
      Seq()
    )
  )

  // @LINE:144
  private[this] lazy val controllers_ProductReviewController_addProductReviewHandle111_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("productReviewHandle")))
  )
  private[this] lazy val controllers_ProductReviewController_addProductReviewHandle111_invoker = createInvoker(
    ProductReviewController_7.addProductReviewHandle,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ProductReviewController",
      "addProductReviewHandle",
      Nil,
      "POST",
      this.prefix + """productReviewHandle""",
      """""",
      Seq()
    )
  )

  // @LINE:145
  private[this] lazy val controllers_ProductReviewController_getProductReviews112_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("productReviews")))
  )
  private[this] lazy val controllers_ProductReviewController_getProductReviews112_invoker = createInvoker(
    ProductReviewController_7.getProductReviews,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ProductReviewController",
      "getProductReviews",
      Nil,
      "GET",
      this.prefix + """productReviews""",
      """""",
      Seq()
    )
  )

  // @LINE:146
  private[this] lazy val controllers_ProductReviewController_getProductReview113_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("productReview/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ProductReviewController_getProductReview113_invoker = createInvoker(
    ProductReviewController_7.getProductReview(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ProductReviewController",
      "getProductReview",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """productReview/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:147
  private[this] lazy val controllers_ProductReviewController_deleteProductReview114_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("productReview/del/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ProductReviewController_deleteProductReview114_invoker = createInvoker(
    ProductReviewController_7.deleteProductReview(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ProductReviewController",
      "deleteProductReview",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """productReview/del/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:148
  private[this] lazy val controllers_ProductReviewController_updateProductReview115_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("productReview/up/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ProductReviewController_updateProductReview115_invoker = createInvoker(
    ProductReviewController_7.updateProductReview(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ProductReviewController",
      "updateProductReview",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """productReview/up/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:149
  private[this] lazy val controllers_ProductReviewController_updateProductReviewHandle116_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("updateproductReview")))
  )
  private[this] lazy val controllers_ProductReviewController_updateProductReviewHandle116_invoker = createInvoker(
    ProductReviewController_7.updateProductReviewHandle,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ProductReviewController",
      "updateProductReviewHandle",
      Nil,
      "POST",
      this.prefix + """updateproductReview""",
      """""",
      Seq()
    )
  )

  // @LINE:151
  private[this] lazy val controllers_ProductReviewController_getProductdReviewsJson117_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/productsReviews")))
  )
  private[this] lazy val controllers_ProductReviewController_getProductdReviewsJson117_invoker = createInvoker(
    ProductReviewController_7.getProductdReviewsJson,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ProductReviewController",
      "getProductdReviewsJson",
      Nil,
      "GET",
      this.prefix + """api/productsReviews""",
      """""",
      Seq()
    )
  )

  // @LINE:152
  private[this] lazy val controllers_ProductReviewController_getProductReviewsJson118_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/productReviews/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ProductReviewController_getProductReviewsJson118_invoker = createInvoker(
    ProductReviewController_7.getProductReviewsJson(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ProductReviewController",
      "getProductReviewsJson",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """api/productReviews/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:153
  private[this] lazy val controllers_ProductReviewController_addProductReviewJson119_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/productReview")))
  )
  private[this] lazy val controllers_ProductReviewController_addProductReviewJson119_invoker = createInvoker(
    ProductReviewController_7.addProductReviewJson,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ProductReviewController",
      "addProductReviewJson",
      Nil,
      "POST",
      this.prefix + """api/productReview""",
      """""",
      Seq()
    )
  )

  // @LINE:154
  private[this] lazy val controllers_ProductReviewController_deleteProductReviewJson120_route = Route("DELETE",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/productReview/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ProductReviewController_deleteProductReviewJson120_invoker = createInvoker(
    ProductReviewController_7.deleteProductReviewJson(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ProductReviewController",
      "deleteProductReviewJson",
      Seq(classOf[Long]),
      "DELETE",
      this.prefix + """api/productReview/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:155
  private[this] lazy val controllers_ProductReviewController_updateProductReviewJson121_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/productReview_update")))
  )
  private[this] lazy val controllers_ProductReviewController_updateProductReviewJson121_invoker = createInvoker(
    ProductReviewController_7.updateProductReviewJson,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ProductReviewController",
      "updateProductReviewJson",
      Nil,
      "POST",
      this.prefix + """api/productReview_update""",
      """""",
      Seq()
    )
  )

  // @LINE:161
  private[this] lazy val controllers_SocialAuthController_authenticate122_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("authenticate/"), DynamicPart("provider", """[^/]+""",true)))
  )
  private[this] lazy val controllers_SocialAuthController_authenticate122_invoker = createInvoker(
    SocialAuthController_0.authenticate(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.SocialAuthController",
      "authenticate",
      Seq(classOf[String]),
      "GET",
      this.prefix + """authenticate/""" + "$" + """provider<[^/]+>""",
      """ Authentication
 POST        /signUp                                   controllers.SignUpController.signUp
 POST        /signIn                                   controllers.SignInController.signIn
 POST        /signOut                                  controllers.SignInController.signOut""",
      Seq()
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:2
    case controllers_HomeController_index0_route(params@_) =>
      call { 
        controllers_HomeController_index0_invoker.call(HomeController_11.index())
      }
  
    // @LINE:5
    case controllers_Assets_versioned1_route(params@_) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned1_invoker.call(Assets_10.versioned(path, file))
      }
  
    // @LINE:8
    case controllers_ProductController_addProduct2_route(params@_) =>
      call { 
        controllers_ProductController_addProduct2_invoker.call(ProductController_8.addProduct)
      }
  
    // @LINE:9
    case controllers_ProductController_addProductHandle3_route(params@_) =>
      call { 
        controllers_ProductController_addProductHandle3_invoker.call(ProductController_8.addProductHandle)
      }
  
    // @LINE:10
    case controllers_ProductController_getProducts4_route(params@_) =>
      call { 
        controllers_ProductController_getProducts4_invoker.call(ProductController_8.getProducts)
      }
  
    // @LINE:11
    case controllers_ProductController_getProduct5_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_ProductController_getProduct5_invoker.call(ProductController_8.getProduct(id))
      }
  
    // @LINE:12
    case controllers_ProductController_deleteProduct6_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_ProductController_deleteProduct6_invoker.call(ProductController_8.deleteProduct(id))
      }
  
    // @LINE:13
    case controllers_ProductController_updateProduct7_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_ProductController_updateProduct7_invoker.call(ProductController_8.updateProduct(id))
      }
  
    // @LINE:14
    case controllers_ProductController_updateProductHandle8_route(params@_) =>
      call { 
        controllers_ProductController_updateProductHandle8_invoker.call(ProductController_8.updateProductHandle)
      }
  
    // @LINE:16
    case controllers_ProductController_getProductsJson9_route(params@_) =>
      call { 
        controllers_ProductController_getProductsJson9_invoker.call(ProductController_8.getProductsJson)
      }
  
    // @LINE:17
    case controllers_ProductController_getProductJson10_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_ProductController_getProductJson10_invoker.call(ProductController_8.getProductJson(id))
      }
  
    // @LINE:18
    case controllers_ProductController_addProductJson11_route(params@_) =>
      call { 
        controllers_ProductController_addProductJson11_invoker.call(ProductController_8.addProductJson)
      }
  
    // @LINE:19
    case controllers_ProductController_deleteProductJson12_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_ProductController_deleteProductJson12_invoker.call(ProductController_8.deleteProductJson(id))
      }
  
    // @LINE:20
    case controllers_ProductController_updateProductJson13_route(params@_) =>
      call { 
        controllers_ProductController_updateProductJson13_invoker.call(ProductController_8.updateProductJson)
      }
  
    // @LINE:23
    case controllers_CategoryController_addCategory14_route(params@_) =>
      call { 
        controllers_CategoryController_addCategory14_invoker.call(CategoryController_6.addCategory)
      }
  
    // @LINE:24
    case controllers_CategoryController_addCategoryHandle15_route(params@_) =>
      call { 
        controllers_CategoryController_addCategoryHandle15_invoker.call(CategoryController_6.addCategoryHandle)
      }
  
    // @LINE:25
    case controllers_CategoryController_getCategories16_route(params@_) =>
      call { 
        controllers_CategoryController_getCategories16_invoker.call(CategoryController_6.getCategories)
      }
  
    // @LINE:26
    case controllers_CategoryController_getCategory17_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_CategoryController_getCategory17_invoker.call(CategoryController_6.getCategory(id))
      }
  
    // @LINE:27
    case controllers_CategoryController_deleteCategory18_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_CategoryController_deleteCategory18_invoker.call(CategoryController_6.deleteCategory(id))
      }
  
    // @LINE:28
    case controllers_CategoryController_updateCategory19_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_CategoryController_updateCategory19_invoker.call(CategoryController_6.updateCategory(id))
      }
  
    // @LINE:29
    case controllers_CategoryController_updateCategoryHandle20_route(params@_) =>
      call { 
        controllers_CategoryController_updateCategoryHandle20_invoker.call(CategoryController_6.updateCategoryHandle)
      }
  
    // @LINE:31
    case controllers_CategoryController_getCategoriesJson21_route(params@_) =>
      call { 
        controllers_CategoryController_getCategoriesJson21_invoker.call(CategoryController_6.getCategoriesJson)
      }
  
    // @LINE:32
    case controllers_CategoryController_getCategoryJson22_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_CategoryController_getCategoryJson22_invoker.call(CategoryController_6.getCategoryJson(id))
      }
  
    // @LINE:33
    case controllers_CategoryController_addCategoryJson23_route(params@_) =>
      call { 
        controllers_CategoryController_addCategoryJson23_invoker.call(CategoryController_6.addCategoryJson)
      }
  
    // @LINE:34
    case controllers_CategoryController_deleteCategoryJson24_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_CategoryController_deleteCategoryJson24_invoker.call(CategoryController_6.deleteCategoryJson(id))
      }
  
    // @LINE:35
    case controllers_CategoryController_updateCategoryJson25_route(params@_) =>
      call { 
        controllers_CategoryController_updateCategoryJson25_invoker.call(CategoryController_6.updateCategoryJson)
      }
  
    // @LINE:38
    case controllers_UserController_addUser26_route(params@_) =>
      call { 
        controllers_UserController_addUser26_invoker.call(UserController_9.addUser)
      }
  
    // @LINE:39
    case controllers_UserController_addUserHandle27_route(params@_) =>
      call { 
        controllers_UserController_addUserHandle27_invoker.call(UserController_9.addUserHandle)
      }
  
    // @LINE:40
    case controllers_UserController_getUsers28_route(params@_) =>
      call { 
        controllers_UserController_getUsers28_invoker.call(UserController_9.getUsers)
      }
  
    // @LINE:41
    case controllers_UserController_getUser29_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_UserController_getUser29_invoker.call(UserController_9.getUser(id))
      }
  
    // @LINE:42
    case controllers_UserController_deleteUser30_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_UserController_deleteUser30_invoker.call(UserController_9.deleteUser(id))
      }
  
    // @LINE:43
    case controllers_UserController_updateUser31_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_UserController_updateUser31_invoker.call(UserController_9.updateUser(id))
      }
  
    // @LINE:44
    case controllers_UserController_updateUserHandle32_route(params@_) =>
      call { 
        controllers_UserController_updateUserHandle32_invoker.call(UserController_9.updateUserHandle)
      }
  
    // @LINE:46
    case controllers_UserController_getUsersJson33_route(params@_) =>
      call { 
        controllers_UserController_getUsersJson33_invoker.call(UserController_9.getUsersJson)
      }
  
    // @LINE:47
    case controllers_UserController_getUserJson34_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_UserController_getUserJson34_invoker.call(UserController_9.getUserJson(id))
      }
  
    // @LINE:48
    case controllers_UserController_addUserJson35_route(params@_) =>
      call { 
        controllers_UserController_addUserJson35_invoker.call(UserController_9.addUserJson)
      }
  
    // @LINE:49
    case controllers_UserController_deleteUserJson36_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_UserController_deleteUserJson36_invoker.call(UserController_9.deleteUserJson(id))
      }
  
    // @LINE:50
    case controllers_UserController_updateUserJson37_route(params@_) =>
      call { 
        controllers_UserController_updateUserJson37_invoker.call(UserController_9.updateUserJson)
      }
  
    // @LINE:53
    case controllers_UserPaymentController_addUserPayment38_route(params@_) =>
      call { 
        controllers_UserPaymentController_addUserPayment38_invoker.call(UserPaymentController_1.addUserPayment)
      }
  
    // @LINE:54
    case controllers_UserPaymentController_addUserPaymentHandle39_route(params@_) =>
      call { 
        controllers_UserPaymentController_addUserPaymentHandle39_invoker.call(UserPaymentController_1.addUserPaymentHandle)
      }
  
    // @LINE:55
    case controllers_UserPaymentController_getUserPayments40_route(params@_) =>
      call { 
        controllers_UserPaymentController_getUserPayments40_invoker.call(UserPaymentController_1.getUserPayments)
      }
  
    // @LINE:56
    case controllers_UserPaymentController_getUserPayment41_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_UserPaymentController_getUserPayment41_invoker.call(UserPaymentController_1.getUserPayment(id))
      }
  
    // @LINE:57
    case controllers_UserPaymentController_deleteUserPayment42_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_UserPaymentController_deleteUserPayment42_invoker.call(UserPaymentController_1.deleteUserPayment(id))
      }
  
    // @LINE:58
    case controllers_UserPaymentController_updateUserPayment43_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_UserPaymentController_updateUserPayment43_invoker.call(UserPaymentController_1.updateUserPayment(id))
      }
  
    // @LINE:59
    case controllers_UserPaymentController_updateUserPaymentHandle44_route(params@_) =>
      call { 
        controllers_UserPaymentController_updateUserPaymentHandle44_invoker.call(UserPaymentController_1.updateUserPaymentHandle)
      }
  
    // @LINE:61
    case controllers_UserPaymentController_getUserPaymentsJson45_route(params@_) =>
      call { 
        controllers_UserPaymentController_getUserPaymentsJson45_invoker.call(UserPaymentController_1.getUserPaymentsJson)
      }
  
    // @LINE:62
    case controllers_UserPaymentController_getUserPaymentJson46_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_UserPaymentController_getUserPaymentJson46_invoker.call(UserPaymentController_1.getUserPaymentJson(id))
      }
  
    // @LINE:63
    case controllers_UserPaymentController_addUserPaymentJson47_route(params@_) =>
      call { 
        controllers_UserPaymentController_addUserPaymentJson47_invoker.call(UserPaymentController_1.addUserPaymentJson)
      }
  
    // @LINE:64
    case controllers_UserPaymentController_deleteUserPaymentJson48_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_UserPaymentController_deleteUserPaymentJson48_invoker.call(UserPaymentController_1.deleteUserPaymentJson(id))
      }
  
    // @LINE:65
    case controllers_UserPaymentController_updateUserPaymentJson49_route(params@_) =>
      call { 
        controllers_UserPaymentController_updateUserPaymentJson49_invoker.call(UserPaymentController_1.updateUserPaymentJson)
      }
  
    // @LINE:68
    case controllers_UserAddressController_addUserAddress50_route(params@_) =>
      call { 
        controllers_UserAddressController_addUserAddress50_invoker.call(UserAddressController_5.addUserAddress)
      }
  
    // @LINE:69
    case controllers_UserAddressController_addUserAddressHandle51_route(params@_) =>
      call { 
        controllers_UserAddressController_addUserAddressHandle51_invoker.call(UserAddressController_5.addUserAddressHandle)
      }
  
    // @LINE:70
    case controllers_UserAddressController_getUserAddresses52_route(params@_) =>
      call { 
        controllers_UserAddressController_getUserAddresses52_invoker.call(UserAddressController_5.getUserAddresses)
      }
  
    // @LINE:71
    case controllers_UserAddressController_getUserAddress53_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_UserAddressController_getUserAddress53_invoker.call(UserAddressController_5.getUserAddress(id))
      }
  
    // @LINE:72
    case controllers_UserAddressController_deleteUserAddress54_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_UserAddressController_deleteUserAddress54_invoker.call(UserAddressController_5.deleteUserAddress(id))
      }
  
    // @LINE:73
    case controllers_UserAddressController_updateUserAddress55_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_UserAddressController_updateUserAddress55_invoker.call(UserAddressController_5.updateUserAddress(id))
      }
  
    // @LINE:74
    case controllers_UserAddressController_updateUserAddressHandle56_route(params@_) =>
      call { 
        controllers_UserAddressController_updateUserAddressHandle56_invoker.call(UserAddressController_5.updateUserAddressHandle)
      }
  
    // @LINE:76
    case controllers_UserAddressController_getUsersAddressesJson57_route(params@_) =>
      call { 
        controllers_UserAddressController_getUsersAddressesJson57_invoker.call(UserAddressController_5.getUsersAddressesJson)
      }
  
    // @LINE:77
    case controllers_UserAddressController_getUserAddressesJson58_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_UserAddressController_getUserAddressesJson58_invoker.call(UserAddressController_5.getUserAddressesJson(id))
      }
  
    // @LINE:78
    case controllers_UserAddressController_adduserAddresJson59_route(params@_) =>
      call { 
        controllers_UserAddressController_adduserAddresJson59_invoker.call(UserAddressController_5.adduserAddresJson)
      }
  
    // @LINE:79
    case controllers_UserAddressController_deleteuserAddresJson60_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_UserAddressController_deleteuserAddresJson60_invoker.call(UserAddressController_5.deleteuserAddresJson(id))
      }
  
    // @LINE:80
    case controllers_UserAddressController_updateuserAddrestJson61_route(params@_) =>
      call { 
        controllers_UserAddressController_updateuserAddrestJson61_invoker.call(UserAddressController_5.updateuserAddrestJson)
      }
  
    // @LINE:83
    case controllers_DiscountController_addDiscount62_route(params@_) =>
      call { 
        controllers_DiscountController_addDiscount62_invoker.call(DiscountController_12.addDiscount)
      }
  
    // @LINE:84
    case controllers_DiscountController_addDiscountHandle63_route(params@_) =>
      call { 
        controllers_DiscountController_addDiscountHandle63_invoker.call(DiscountController_12.addDiscountHandle)
      }
  
    // @LINE:85
    case controllers_DiscountController_getDiscounts64_route(params@_) =>
      call { 
        controllers_DiscountController_getDiscounts64_invoker.call(DiscountController_12.getDiscounts)
      }
  
    // @LINE:86
    case controllers_DiscountController_getDiscount65_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_DiscountController_getDiscount65_invoker.call(DiscountController_12.getDiscount(id))
      }
  
    // @LINE:87
    case controllers_DiscountController_deleteDiscount66_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_DiscountController_deleteDiscount66_invoker.call(DiscountController_12.deleteDiscount(id))
      }
  
    // @LINE:88
    case controllers_DiscountController_updateDiscount67_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_DiscountController_updateDiscount67_invoker.call(DiscountController_12.updateDiscount(id))
      }
  
    // @LINE:89
    case controllers_DiscountController_updateDiscountHandle68_route(params@_) =>
      call { 
        controllers_DiscountController_updateDiscountHandle68_invoker.call(DiscountController_12.updateDiscountHandle)
      }
  
    // @LINE:91
    case controllers_DiscountController_getDiscountsJson69_route(params@_) =>
      call { 
        controllers_DiscountController_getDiscountsJson69_invoker.call(DiscountController_12.getDiscountsJson)
      }
  
    // @LINE:92
    case controllers_DiscountController_getDiscountJson70_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_DiscountController_getDiscountJson70_invoker.call(DiscountController_12.getDiscountJson(id))
      }
  
    // @LINE:93
    case controllers_DiscountController_addDiscountJson71_route(params@_) =>
      call { 
        controllers_DiscountController_addDiscountJson71_invoker.call(DiscountController_12.addDiscountJson)
      }
  
    // @LINE:94
    case controllers_DiscountController_deleteDiscountJson72_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_DiscountController_deleteDiscountJson72_invoker.call(DiscountController_12.deleteDiscountJson(id))
      }
  
    // @LINE:95
    case controllers_DiscountController_updateDiscountJson73_route(params@_) =>
      call { 
        controllers_DiscountController_updateDiscountJson73_invoker.call(DiscountController_12.updateDiscountJson)
      }
  
    // @LINE:98
    case controllers_CartController_addCart74_route(params@_) =>
      call { 
        controllers_CartController_addCart74_invoker.call(CartController_2.addCart)
      }
  
    // @LINE:99
    case controllers_CartController_addCartHandle75_route(params@_) =>
      call { 
        controllers_CartController_addCartHandle75_invoker.call(CartController_2.addCartHandle)
      }
  
    // @LINE:100
    case controllers_CartController_getCarts76_route(params@_) =>
      call { 
        controllers_CartController_getCarts76_invoker.call(CartController_2.getCarts)
      }
  
    // @LINE:101
    case controllers_CartController_getCart77_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_CartController_getCart77_invoker.call(CartController_2.getCart(id))
      }
  
    // @LINE:102
    case controllers_CartController_deleteCart78_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_CartController_deleteCart78_invoker.call(CartController_2.deleteCart(id))
      }
  
    // @LINE:103
    case controllers_CartController_updateCart79_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_CartController_updateCart79_invoker.call(CartController_2.updateCart(id))
      }
  
    // @LINE:104
    case controllers_CartController_updateCartHandle80_route(params@_) =>
      call { 
        controllers_CartController_updateCartHandle80_invoker.call(CartController_2.updateCartHandle())
      }
  
    // @LINE:106
    case controllers_CartController_getCartsJson81_route(params@_) =>
      call { 
        controllers_CartController_getCartsJson81_invoker.call(CartController_2.getCartsJson)
      }
  
    // @LINE:107
    case controllers_CartController_getCartJson82_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_CartController_getCartJson82_invoker.call(CartController_2.getCartJson(id))
      }
  
    // @LINE:108
    case controllers_CartController_addCartJson83_route(params@_) =>
      call { 
        controllers_CartController_addCartJson83_invoker.call(CartController_2.addCartJson)
      }
  
    // @LINE:109
    case controllers_CartController_deleteCartJson84_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_CartController_deleteCartJson84_invoker.call(CartController_2.deleteCartJson(id))
      }
  
    // @LINE:110
    case controllers_CartController_updateCartJson85_route(params@_) =>
      call { 
        controllers_CartController_updateCartJson85_invoker.call(CartController_2.updateCartJson)
      }
  
    // @LINE:113
    case controllers_OrderController_addOrder86_route(params@_) =>
      call { 
        controllers_OrderController_addOrder86_invoker.call(OrderController_3.addOrder)
      }
  
    // @LINE:114
    case controllers_OrderController_addOrderHandle87_route(params@_) =>
      call { 
        controllers_OrderController_addOrderHandle87_invoker.call(OrderController_3.addOrderHandle)
      }
  
    // @LINE:115
    case controllers_OrderController_getOrders88_route(params@_) =>
      call { 
        controllers_OrderController_getOrders88_invoker.call(OrderController_3.getOrders)
      }
  
    // @LINE:116
    case controllers_OrderController_getOrder89_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_OrderController_getOrder89_invoker.call(OrderController_3.getOrder(id))
      }
  
    // @LINE:117
    case controllers_OrderController_deleteOrder90_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_OrderController_deleteOrder90_invoker.call(OrderController_3.deleteOrder(id))
      }
  
    // @LINE:118
    case controllers_OrderController_updateOrder91_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_OrderController_updateOrder91_invoker.call(OrderController_3.updateOrder(id))
      }
  
    // @LINE:119
    case controllers_OrderController_updateOrderHandle92_route(params@_) =>
      call { 
        controllers_OrderController_updateOrderHandle92_invoker.call(OrderController_3.updateOrderHandle)
      }
  
    // @LINE:121
    case controllers_OrderController_getOrdersJson93_route(params@_) =>
      call { 
        controllers_OrderController_getOrdersJson93_invoker.call(OrderController_3.getOrdersJson)
      }
  
    // @LINE:122
    case controllers_OrderController_getOrderJson94_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_OrderController_getOrderJson94_invoker.call(OrderController_3.getOrderJson(id))
      }
  
    // @LINE:123
    case controllers_OrderController_addOrderJson95_route(params@_) =>
      call { 
        controllers_OrderController_addOrderJson95_invoker.call(OrderController_3.addOrderJson)
      }
  
    // @LINE:124
    case controllers_OrderController_deleteOrderJson96_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_OrderController_deleteOrderJson96_invoker.call(OrderController_3.deleteOrderJson(id))
      }
  
    // @LINE:125
    case controllers_OrderController_updateOrderJson97_route(params@_) =>
      call { 
        controllers_OrderController_updateOrderJson97_invoker.call(OrderController_3.updateOrderJson)
      }
  
    // @LINE:128
    case controllers_CartItemController_addCartItem98_route(params@_) =>
      call { 
        controllers_CartItemController_addCartItem98_invoker.call(CartItemController_4.addCartItem)
      }
  
    // @LINE:129
    case controllers_CartItemController_addCartItemHandle99_route(params@_) =>
      call { 
        controllers_CartItemController_addCartItemHandle99_invoker.call(CartItemController_4.addCartItemHandle)
      }
  
    // @LINE:130
    case controllers_CartItemController_getCartItems100_route(params@_) =>
      call { 
        controllers_CartItemController_getCartItems100_invoker.call(CartItemController_4.getCartItems)
      }
  
    // @LINE:131
    case controllers_CartItemController_getCartItem101_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_CartItemController_getCartItem101_invoker.call(CartItemController_4.getCartItem(id))
      }
  
    // @LINE:132
    case controllers_CartItemController_deleteCartItem102_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_CartItemController_deleteCartItem102_invoker.call(CartItemController_4.deleteCartItem(id))
      }
  
    // @LINE:133
    case controllers_CartItemController_updateCartItem103_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_CartItemController_updateCartItem103_invoker.call(CartItemController_4.updateCartItem(id))
      }
  
    // @LINE:134
    case controllers_CartItemController_updateCartItemHandle104_route(params@_) =>
      call { 
        controllers_CartItemController_updateCartItemHandle104_invoker.call(CartItemController_4.updateCartItemHandle)
      }
  
    // @LINE:136
    case controllers_CartItemController_getCartsItemsJson105_route(params@_) =>
      call { 
        controllers_CartItemController_getCartsItemsJson105_invoker.call(CartItemController_4.getCartsItemsJson)
      }
  
    // @LINE:137
    case controllers_CartItemController_getCarItemsJson106_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_CartItemController_getCarItemsJson106_invoker.call(CartItemController_4.getCarItemsJson(id))
      }
  
    // @LINE:138
    case controllers_CartItemController_addCarItemJson107_route(params@_) =>
      call { 
        controllers_CartItemController_addCarItemJson107_invoker.call(CartItemController_4.addCarItemJson)
      }
  
    // @LINE:139
    case controllers_CartItemController_deleteCarItemJson108_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_CartItemController_deleteCarItemJson108_invoker.call(CartItemController_4.deleteCarItemJson(id))
      }
  
    // @LINE:140
    case controllers_CartItemController_updateCarItemJson109_route(params@_) =>
      call { 
        controllers_CartItemController_updateCarItemJson109_invoker.call(CartItemController_4.updateCarItemJson)
      }
  
    // @LINE:143
    case controllers_ProductReviewController_addProductReview110_route(params@_) =>
      call { 
        controllers_ProductReviewController_addProductReview110_invoker.call(ProductReviewController_7.addProductReview)
      }
  
    // @LINE:144
    case controllers_ProductReviewController_addProductReviewHandle111_route(params@_) =>
      call { 
        controllers_ProductReviewController_addProductReviewHandle111_invoker.call(ProductReviewController_7.addProductReviewHandle)
      }
  
    // @LINE:145
    case controllers_ProductReviewController_getProductReviews112_route(params@_) =>
      call { 
        controllers_ProductReviewController_getProductReviews112_invoker.call(ProductReviewController_7.getProductReviews)
      }
  
    // @LINE:146
    case controllers_ProductReviewController_getProductReview113_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_ProductReviewController_getProductReview113_invoker.call(ProductReviewController_7.getProductReview(id))
      }
  
    // @LINE:147
    case controllers_ProductReviewController_deleteProductReview114_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_ProductReviewController_deleteProductReview114_invoker.call(ProductReviewController_7.deleteProductReview(id))
      }
  
    // @LINE:148
    case controllers_ProductReviewController_updateProductReview115_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_ProductReviewController_updateProductReview115_invoker.call(ProductReviewController_7.updateProductReview(id))
      }
  
    // @LINE:149
    case controllers_ProductReviewController_updateProductReviewHandle116_route(params@_) =>
      call { 
        controllers_ProductReviewController_updateProductReviewHandle116_invoker.call(ProductReviewController_7.updateProductReviewHandle)
      }
  
    // @LINE:151
    case controllers_ProductReviewController_getProductdReviewsJson117_route(params@_) =>
      call { 
        controllers_ProductReviewController_getProductdReviewsJson117_invoker.call(ProductReviewController_7.getProductdReviewsJson)
      }
  
    // @LINE:152
    case controllers_ProductReviewController_getProductReviewsJson118_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_ProductReviewController_getProductReviewsJson118_invoker.call(ProductReviewController_7.getProductReviewsJson(id))
      }
  
    // @LINE:153
    case controllers_ProductReviewController_addProductReviewJson119_route(params@_) =>
      call { 
        controllers_ProductReviewController_addProductReviewJson119_invoker.call(ProductReviewController_7.addProductReviewJson)
      }
  
    // @LINE:154
    case controllers_ProductReviewController_deleteProductReviewJson120_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_ProductReviewController_deleteProductReviewJson120_invoker.call(ProductReviewController_7.deleteProductReviewJson(id))
      }
  
    // @LINE:155
    case controllers_ProductReviewController_updateProductReviewJson121_route(params@_) =>
      call { 
        controllers_ProductReviewController_updateProductReviewJson121_invoker.call(ProductReviewController_7.updateProductReviewJson)
      }
  
    // @LINE:161
    case controllers_SocialAuthController_authenticate122_route(params@_) =>
      call(params.fromPath[String]("provider", None)) { (provider) =>
        controllers_SocialAuthController_authenticate122_invoker.call(SocialAuthController_0.authenticate(provider))
      }
  }
}
