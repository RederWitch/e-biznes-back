// @GENERATOR:play-routes-compiler
// @SOURCE:/home/wiki/Pulpit/e-biznes-main/shop-project/shop-project/conf/routes
// @DATE:Thu Aug 19 21:51:00 CEST 2021

import play.api.mvc.Call


import _root_.controllers.Assets.Asset

// @LINE:2
package controllers {

  // @LINE:83
  class ReverseDiscountController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:94
    def deleteDiscountJson(id:Long): Call = {
      
      Call("DELETE", _prefix + { _defaultPrefix } + "api/discount/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
    // @LINE:88
    def updateDiscount(id:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "discount/up/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
    // @LINE:89
    def updateDiscountHandle(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "updatediscount")
    }
  
    // @LINE:85
    def getDiscounts(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "discounts")
    }
  
    // @LINE:92
    def getDiscountJson(id:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "api/discount/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
    // @LINE:93
    def addDiscountJson(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "api/discount")
    }
  
    // @LINE:86
    def getDiscount(id:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "discount/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
    // @LINE:87
    def deleteDiscount(id:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "discount/del/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
    // @LINE:95
    def updateDiscountJson(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "api/discount_update")
    }
  
    // @LINE:91
    def getDiscountsJson(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "api/discounts")
    }
  
    // @LINE:84
    def addDiscountHandle(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "adddiscountHandle")
    }
  
    // @LINE:83
    def addDiscount(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "adddiscount")
    }
  
  }

  // @LINE:5
  class ReverseAssets(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:5
    def versioned(file:Asset): Call = {
      implicit lazy val _rrc = new play.core.routing.ReverseRouteContext(Map(("path", "/public"))); _rrc
      Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[play.api.mvc.PathBindable[Asset]].unbind("file", file))
    }
  
  }

  // @LINE:53
  class ReverseUserPaymentController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:55
    def getUserPayments(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "userPayments")
    }
  
    // @LINE:62
    def getUserPaymentJson(id:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "api/usersPayment" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
    // @LINE:54
    def addUserPaymentHandle(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "adduserPaymentHandle")
    }
  
    // @LINE:64
    def deleteUserPaymentJson(id:Long): Call = {
      
      Call("DELETE", _prefix + { _defaultPrefix } + "api/usersPayment/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
    // @LINE:63
    def addUserPaymentJson(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "api/usersPayment")
    }
  
    // @LINE:53
    def addUserPayment(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "adduserPayment")
    }
  
    // @LINE:58
    def updateUserPayment(id:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "userPayment/up/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
    // @LINE:56
    def getUserPayment(id:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "userPayment/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
    // @LINE:57
    def deleteUserPayment(id:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "userPayment/del/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
    // @LINE:59
    def updateUserPaymentHandle(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "updateuserPaymentHandle")
    }
  
    // @LINE:65
    def updateUserPaymentJson(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "api/usersPayment_update")
    }
  
    // @LINE:61
    def getUserPaymentsJson(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "api/usersPayments")
    }
  
  }

  // @LINE:161
  class ReverseSocialAuthController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:161
    def authenticate(provider:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "authenticate/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("provider", provider)))
    }
  
  }

  // @LINE:68
  class ReverseUserAddressController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:78
    def adduserAddresJson(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "api/userAddres")
    }
  
    // @LINE:71
    def getUserAddress(id:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "userAddress/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
    // @LINE:70
    def getUserAddresses(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "userAddresses")
    }
  
    // @LINE:69
    def addUserAddressHandle(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "adduserAddressHandle")
    }
  
    // @LINE:79
    def deleteuserAddresJson(id:Long): Call = {
      
      Call("DELETE", _prefix + { _defaultPrefix } + "api/userAddres/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
    // @LINE:77
    def getUserAddressesJson(id:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "api/userAddresses/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
    // @LINE:80
    def updateuserAddrestJson(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "api/userAddres_update")
    }
  
    // @LINE:68
    def addUserAddress(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "adduserAddress")
    }
  
    // @LINE:76
    def getUsersAddressesJson(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "api/usersAddresses")
    }
  
    // @LINE:73
    def updateUserAddress(id:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "userAddress/up/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
    // @LINE:74
    def updateUserAddressHandle(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "updateuserAddress")
    }
  
    // @LINE:72
    def deleteUserAddress(id:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "userAddress/del/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
  }

  // @LINE:98
  class ReverseCartController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:104
    def updateCartHandle(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "updatecart")
    }
  
    // @LINE:110
    def updateCartJson(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "api/cart_update")
    }
  
    // @LINE:101
    def getCart(id:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "cart/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
    // @LINE:100
    def getCarts(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "carts")
    }
  
    // @LINE:108
    def addCartJson(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "api/cart")
    }
  
    // @LINE:102
    def deleteCart(id:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "cart/del/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
    // @LINE:98
    def addCart(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "addcart")
    }
  
    // @LINE:99
    def addCartHandle(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "addcartHandle")
    }
  
    // @LINE:103
    def updateCart(id:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "cart/up/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
    // @LINE:107
    def getCartJson(id:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "api/carts/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
    // @LINE:109
    def deleteCartJson(id:Long): Call = {
      
      Call("DELETE", _prefix + { _defaultPrefix } + "api/cart/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
    // @LINE:106
    def getCartsJson(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "api/carts")
    }
  
  }

  // @LINE:23
  class ReverseCategoryController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:32
    def getCategoryJson(id:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "api/category/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
    // @LINE:31
    def getCategoriesJson(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "api/categories")
    }
  
    // @LINE:23
    def addCategory(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "addcategory")
    }
  
    // @LINE:25
    def getCategories(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "categories")
    }
  
    // @LINE:26
    def getCategory(id:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "category/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
    // @LINE:27
    def deleteCategory(id:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "category/del/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
    // @LINE:24
    def addCategoryHandle(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "addcategoryhandle")
    }
  
    // @LINE:29
    def updateCategoryHandle(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "updatecategoryhandle")
    }
  
    // @LINE:35
    def updateCategoryJson(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "api/category_update")
    }
  
    // @LINE:33
    def addCategoryJson(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "api/category")
    }
  
    // @LINE:28
    def updateCategory(id:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "category/up/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
    // @LINE:34
    def deleteCategoryJson(id:Long): Call = {
      
      Call("DELETE", _prefix + { _defaultPrefix } + "api/category/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
  }

  // @LINE:8
  class ReverseProductController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:16
    def getProductsJson(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "api/products")
    }
  
    // @LINE:11
    def getProduct(id:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "product/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
    // @LINE:17
    def getProductJson(id:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "api/product/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
    // @LINE:10
    def getProducts(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "products")
    }
  
    // @LINE:14
    def updateProductHandle(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "updateproducthandle")
    }
  
    // @LINE:18
    def addProductJson(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "api/product")
    }
  
    // @LINE:9
    def addProductHandle(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "addproducthandle")
    }
  
    // @LINE:12
    def deleteProduct(id:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "product/del/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
    // @LINE:13
    def updateProduct(id:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "product/up/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
    // @LINE:20
    def updateProductJson(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "api/product_update")
    }
  
    // @LINE:8
    def addProduct(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "addproduct")
    }
  
    // @LINE:19
    def deleteProductJson(id:Long): Call = {
      
      Call("DELETE", _prefix + { _defaultPrefix } + "api/product/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
  }

  // @LINE:38
  class ReverseUserController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:39
    def addUserHandle(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "adduserhandle")
    }
  
    // @LINE:38
    def addUser(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "adduser")
    }
  
    // @LINE:41
    def getUser(id:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "user/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
    // @LINE:43
    def updateUser(id:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "user/up/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
    // @LINE:40
    def getUsers(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "users")
    }
  
    // @LINE:42
    def deleteUser(id:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "user/del/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
    // @LINE:47
    def getUserJson(id:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "api/user/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
    // @LINE:49
    def deleteUserJson(id:Long): Call = {
      
      Call("DELETE", _prefix + { _defaultPrefix } + "api/user/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
    // @LINE:46
    def getUsersJson(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "api/users")
    }
  
    // @LINE:50
    def updateUserJson(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "api/user_update")
    }
  
    // @LINE:48
    def addUserJson(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "api/user")
    }
  
    // @LINE:44
    def updateUserHandle(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "updateuserhandle")
    }
  
  }

  // @LINE:2
  class ReverseHomeController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:2
    def index(): Call = {
      
      Call("GET", _prefix)
    }
  
  }

  // @LINE:113
  class ReverseOrderController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:122
    def getOrderJson(id:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "api/order/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
    // @LINE:123
    def addOrderJson(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "api/order")
    }
  
    // @LINE:117
    def deleteOrder(id:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "order/del/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
    // @LINE:114
    def addOrderHandle(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "orderHandle")
    }
  
    // @LINE:125
    def updateOrderJson(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "api/order_update")
    }
  
    // @LINE:124
    def deleteOrderJson(id:Long): Call = {
      
      Call("DELETE", _prefix + { _defaultPrefix } + "api/order/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
    // @LINE:119
    def updateOrderHandle(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "updateorder")
    }
  
    // @LINE:113
    def addOrder(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "addorder")
    }
  
    // @LINE:115
    def getOrders(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "orders")
    }
  
    // @LINE:116
    def getOrder(id:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "order/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
    // @LINE:118
    def updateOrder(id:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "order/up/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
    // @LINE:121
    def getOrdersJson(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "api/orders")
    }
  
  }

  // @LINE:143
  class ReverseProductReviewController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:146
    def getProductReview(id:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "productReview/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
    // @LINE:144
    def addProductReviewHandle(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "productReviewHandle")
    }
  
    // @LINE:147
    def deleteProductReview(id:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "productReview/del/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
    // @LINE:152
    def getProductReviewsJson(id:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "api/productReviews/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
    // @LINE:145
    def getProductReviews(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "productReviews")
    }
  
    // @LINE:151
    def getProductdReviewsJson(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "api/productsReviews")
    }
  
    // @LINE:155
    def updateProductReviewJson(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "api/productReview_update")
    }
  
    // @LINE:149
    def updateProductReviewHandle(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "updateproductReview")
    }
  
    // @LINE:153
    def addProductReviewJson(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "api/productReview")
    }
  
    // @LINE:143
    def addProductReview(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "productReview")
    }
  
    // @LINE:148
    def updateProductReview(id:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "productReview/up/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
    // @LINE:154
    def deleteProductReviewJson(id:Long): Call = {
      
      Call("DELETE", _prefix + { _defaultPrefix } + "api/productReview/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
  }

  // @LINE:128
  class ReverseCartItemController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:133
    def updateCartItem(id:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "cartItem/up/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
    // @LINE:128
    def addCartItem(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "addcartItem")
    }
  
    // @LINE:138
    def addCarItemJson(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "api/cartItem")
    }
  
    // @LINE:136
    def getCartsItemsJson(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "api/cartsItems")
    }
  
    // @LINE:129
    def addCartItemHandle(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "addcartItemHandle")
    }
  
    // @LINE:130
    def getCartItems(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "cartItems")
    }
  
    // @LINE:140
    def updateCarItemJson(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "api/cartItem_update")
    }
  
    // @LINE:131
    def getCartItem(id:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "cartItem/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
    // @LINE:132
    def deleteCartItem(id:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "cartItem/del/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
    // @LINE:139
    def deleteCarItemJson(id:Long): Call = {
      
      Call("DELETE", _prefix + { _defaultPrefix } + "api/cartItem/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
    // @LINE:137
    def getCarItemsJson(id:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "api/cartItems/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
    // @LINE:134
    def updateCartItemHandle(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "updatecartItem")
    }
  
  }


}
