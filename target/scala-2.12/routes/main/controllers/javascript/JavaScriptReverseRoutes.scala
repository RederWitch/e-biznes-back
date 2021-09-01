// @GENERATOR:play-routes-compiler
// @SOURCE:/home/wiki/Pulpit/e-biznes-main/shop-project/shop-project/conf/routes
// @DATE:Thu Aug 19 21:51:00 CEST 2021

import play.api.routing.JavaScriptReverseRoute


import _root_.controllers.Assets.Asset

// @LINE:2
package controllers.javascript {

  // @LINE:83
  class ReverseDiscountController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:94
    def deleteDiscountJson: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.DiscountController.deleteDiscountJson",
      """
        function(id0) {
          return _wA({method:"DELETE", url:"""" + _prefix + { _defaultPrefix } + """" + "api/discount/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:88
    def updateDiscount: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.DiscountController.updateDiscount",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "discount/up/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:89
    def updateDiscountHandle: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.DiscountController.updateDiscountHandle",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "updatediscount"})
        }
      """
    )
  
    // @LINE:85
    def getDiscounts: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.DiscountController.getDiscounts",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "discounts"})
        }
      """
    )
  
    // @LINE:92
    def getDiscountJson: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.DiscountController.getDiscountJson",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "api/discount/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:93
    def addDiscountJson: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.DiscountController.addDiscountJson",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "api/discount"})
        }
      """
    )
  
    // @LINE:86
    def getDiscount: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.DiscountController.getDiscount",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "discount/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:87
    def deleteDiscount: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.DiscountController.deleteDiscount",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "discount/del/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:95
    def updateDiscountJson: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.DiscountController.updateDiscountJson",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "api/discount_update"})
        }
      """
    )
  
    // @LINE:91
    def getDiscountsJson: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.DiscountController.getDiscountsJson",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "api/discounts"})
        }
      """
    )
  
    // @LINE:84
    def addDiscountHandle: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.DiscountController.addDiscountHandle",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "adddiscountHandle"})
        }
      """
    )
  
    // @LINE:83
    def addDiscount: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.DiscountController.addDiscount",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "adddiscount"})
        }
      """
    )
  
  }

  // @LINE:5
  class ReverseAssets(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:5
    def versioned: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Assets.versioned",
      """
        function(file1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[play.api.mvc.PathBindable[Asset]].javascriptUnbind + """)("file", file1)})
        }
      """
    )
  
  }

  // @LINE:53
  class ReverseUserPaymentController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:55
    def getUserPayments: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UserPaymentController.getUserPayments",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "userPayments"})
        }
      """
    )
  
    // @LINE:62
    def getUserPaymentJson: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UserPaymentController.getUserPaymentJson",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "api/usersPayment" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:54
    def addUserPaymentHandle: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UserPaymentController.addUserPaymentHandle",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "adduserPaymentHandle"})
        }
      """
    )
  
    // @LINE:64
    def deleteUserPaymentJson: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UserPaymentController.deleteUserPaymentJson",
      """
        function(id0) {
          return _wA({method:"DELETE", url:"""" + _prefix + { _defaultPrefix } + """" + "api/usersPayment/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:63
    def addUserPaymentJson: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UserPaymentController.addUserPaymentJson",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "api/usersPayment"})
        }
      """
    )
  
    // @LINE:53
    def addUserPayment: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UserPaymentController.addUserPayment",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "adduserPayment"})
        }
      """
    )
  
    // @LINE:58
    def updateUserPayment: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UserPaymentController.updateUserPayment",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "userPayment/up/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:56
    def getUserPayment: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UserPaymentController.getUserPayment",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "userPayment/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:57
    def deleteUserPayment: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UserPaymentController.deleteUserPayment",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "userPayment/del/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:59
    def updateUserPaymentHandle: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UserPaymentController.updateUserPaymentHandle",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "updateuserPaymentHandle"})
        }
      """
    )
  
    // @LINE:65
    def updateUserPaymentJson: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UserPaymentController.updateUserPaymentJson",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "api/usersPayment_update"})
        }
      """
    )
  
    // @LINE:61
    def getUserPaymentsJson: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UserPaymentController.getUserPaymentsJson",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "api/usersPayments"})
        }
      """
    )
  
  }

  // @LINE:161
  class ReverseSocialAuthController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:161
    def authenticate: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.SocialAuthController.authenticate",
      """
        function(provider0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "authenticate/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("provider", provider0))})
        }
      """
    )
  
  }

  // @LINE:68
  class ReverseUserAddressController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:78
    def adduserAddresJson: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UserAddressController.adduserAddresJson",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "api/userAddres"})
        }
      """
    )
  
    // @LINE:71
    def getUserAddress: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UserAddressController.getUserAddress",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "userAddress/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:70
    def getUserAddresses: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UserAddressController.getUserAddresses",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "userAddresses"})
        }
      """
    )
  
    // @LINE:69
    def addUserAddressHandle: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UserAddressController.addUserAddressHandle",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "adduserAddressHandle"})
        }
      """
    )
  
    // @LINE:79
    def deleteuserAddresJson: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UserAddressController.deleteuserAddresJson",
      """
        function(id0) {
          return _wA({method:"DELETE", url:"""" + _prefix + { _defaultPrefix } + """" + "api/userAddres/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:77
    def getUserAddressesJson: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UserAddressController.getUserAddressesJson",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "api/userAddresses/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:80
    def updateuserAddrestJson: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UserAddressController.updateuserAddrestJson",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "api/userAddres_update"})
        }
      """
    )
  
    // @LINE:68
    def addUserAddress: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UserAddressController.addUserAddress",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "adduserAddress"})
        }
      """
    )
  
    // @LINE:76
    def getUsersAddressesJson: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UserAddressController.getUsersAddressesJson",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "api/usersAddresses"})
        }
      """
    )
  
    // @LINE:73
    def updateUserAddress: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UserAddressController.updateUserAddress",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "userAddress/up/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:74
    def updateUserAddressHandle: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UserAddressController.updateUserAddressHandle",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "updateuserAddress"})
        }
      """
    )
  
    // @LINE:72
    def deleteUserAddress: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UserAddressController.deleteUserAddress",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "userAddress/del/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
  }

  // @LINE:98
  class ReverseCartController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:104
    def updateCartHandle: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.CartController.updateCartHandle",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "updatecart"})
        }
      """
    )
  
    // @LINE:110
    def updateCartJson: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.CartController.updateCartJson",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "api/cart_update"})
        }
      """
    )
  
    // @LINE:101
    def getCart: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.CartController.getCart",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "cart/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:100
    def getCarts: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.CartController.getCarts",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "carts"})
        }
      """
    )
  
    // @LINE:108
    def addCartJson: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.CartController.addCartJson",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "api/cart"})
        }
      """
    )
  
    // @LINE:102
    def deleteCart: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.CartController.deleteCart",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "cart/del/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:98
    def addCart: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.CartController.addCart",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "addcart"})
        }
      """
    )
  
    // @LINE:99
    def addCartHandle: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.CartController.addCartHandle",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "addcartHandle"})
        }
      """
    )
  
    // @LINE:103
    def updateCart: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.CartController.updateCart",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "cart/up/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:107
    def getCartJson: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.CartController.getCartJson",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "api/carts/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:109
    def deleteCartJson: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.CartController.deleteCartJson",
      """
        function(id0) {
          return _wA({method:"DELETE", url:"""" + _prefix + { _defaultPrefix } + """" + "api/cart/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:106
    def getCartsJson: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.CartController.getCartsJson",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "api/carts"})
        }
      """
    )
  
  }

  // @LINE:23
  class ReverseCategoryController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:32
    def getCategoryJson: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.CategoryController.getCategoryJson",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "api/category/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:31
    def getCategoriesJson: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.CategoryController.getCategoriesJson",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "api/categories"})
        }
      """
    )
  
    // @LINE:23
    def addCategory: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.CategoryController.addCategory",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "addcategory"})
        }
      """
    )
  
    // @LINE:25
    def getCategories: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.CategoryController.getCategories",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "categories"})
        }
      """
    )
  
    // @LINE:26
    def getCategory: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.CategoryController.getCategory",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "category/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:27
    def deleteCategory: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.CategoryController.deleteCategory",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "category/del/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:24
    def addCategoryHandle: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.CategoryController.addCategoryHandle",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "addcategoryhandle"})
        }
      """
    )
  
    // @LINE:29
    def updateCategoryHandle: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.CategoryController.updateCategoryHandle",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "updatecategoryhandle"})
        }
      """
    )
  
    // @LINE:35
    def updateCategoryJson: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.CategoryController.updateCategoryJson",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "api/category_update"})
        }
      """
    )
  
    // @LINE:33
    def addCategoryJson: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.CategoryController.addCategoryJson",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "api/category"})
        }
      """
    )
  
    // @LINE:28
    def updateCategory: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.CategoryController.updateCategory",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "category/up/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:34
    def deleteCategoryJson: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.CategoryController.deleteCategoryJson",
      """
        function(id0) {
          return _wA({method:"DELETE", url:"""" + _prefix + { _defaultPrefix } + """" + "api/category/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
  }

  // @LINE:8
  class ReverseProductController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:16
    def getProductsJson: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ProductController.getProductsJson",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "api/products"})
        }
      """
    )
  
    // @LINE:11
    def getProduct: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ProductController.getProduct",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "product/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:17
    def getProductJson: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ProductController.getProductJson",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "api/product/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:10
    def getProducts: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ProductController.getProducts",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "products"})
        }
      """
    )
  
    // @LINE:14
    def updateProductHandle: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ProductController.updateProductHandle",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "updateproducthandle"})
        }
      """
    )
  
    // @LINE:18
    def addProductJson: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ProductController.addProductJson",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "api/product"})
        }
      """
    )
  
    // @LINE:9
    def addProductHandle: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ProductController.addProductHandle",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "addproducthandle"})
        }
      """
    )
  
    // @LINE:12
    def deleteProduct: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ProductController.deleteProduct",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "product/del/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:13
    def updateProduct: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ProductController.updateProduct",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "product/up/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:20
    def updateProductJson: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ProductController.updateProductJson",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "api/product_update"})
        }
      """
    )
  
    // @LINE:8
    def addProduct: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ProductController.addProduct",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "addproduct"})
        }
      """
    )
  
    // @LINE:19
    def deleteProductJson: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ProductController.deleteProductJson",
      """
        function(id0) {
          return _wA({method:"DELETE", url:"""" + _prefix + { _defaultPrefix } + """" + "api/product/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
  }

  // @LINE:38
  class ReverseUserController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:39
    def addUserHandle: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UserController.addUserHandle",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "adduserhandle"})
        }
      """
    )
  
    // @LINE:38
    def addUser: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UserController.addUser",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "adduser"})
        }
      """
    )
  
    // @LINE:41
    def getUser: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UserController.getUser",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "user/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:43
    def updateUser: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UserController.updateUser",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "user/up/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:40
    def getUsers: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UserController.getUsers",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "users"})
        }
      """
    )
  
    // @LINE:42
    def deleteUser: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UserController.deleteUser",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "user/del/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:47
    def getUserJson: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UserController.getUserJson",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "api/user/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:49
    def deleteUserJson: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UserController.deleteUserJson",
      """
        function(id0) {
          return _wA({method:"DELETE", url:"""" + _prefix + { _defaultPrefix } + """" + "api/user/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:46
    def getUsersJson: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UserController.getUsersJson",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "api/users"})
        }
      """
    )
  
    // @LINE:50
    def updateUserJson: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UserController.updateUserJson",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "api/user_update"})
        }
      """
    )
  
    // @LINE:48
    def addUserJson: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UserController.addUserJson",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "api/user"})
        }
      """
    )
  
    // @LINE:44
    def updateUserHandle: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UserController.updateUserHandle",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "updateuserhandle"})
        }
      """
    )
  
  }

  // @LINE:2
  class ReverseHomeController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:2
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.index",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + """"})
        }
      """
    )
  
  }

  // @LINE:113
  class ReverseOrderController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:122
    def getOrderJson: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.OrderController.getOrderJson",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "api/order/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:123
    def addOrderJson: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.OrderController.addOrderJson",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "api/order"})
        }
      """
    )
  
    // @LINE:117
    def deleteOrder: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.OrderController.deleteOrder",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "order/del/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:114
    def addOrderHandle: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.OrderController.addOrderHandle",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "orderHandle"})
        }
      """
    )
  
    // @LINE:125
    def updateOrderJson: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.OrderController.updateOrderJson",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "api/order_update"})
        }
      """
    )
  
    // @LINE:124
    def deleteOrderJson: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.OrderController.deleteOrderJson",
      """
        function(id0) {
          return _wA({method:"DELETE", url:"""" + _prefix + { _defaultPrefix } + """" + "api/order/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:119
    def updateOrderHandle: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.OrderController.updateOrderHandle",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "updateorder"})
        }
      """
    )
  
    // @LINE:113
    def addOrder: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.OrderController.addOrder",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "addorder"})
        }
      """
    )
  
    // @LINE:115
    def getOrders: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.OrderController.getOrders",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "orders"})
        }
      """
    )
  
    // @LINE:116
    def getOrder: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.OrderController.getOrder",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "order/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:118
    def updateOrder: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.OrderController.updateOrder",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "order/up/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:121
    def getOrdersJson: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.OrderController.getOrdersJson",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "api/orders"})
        }
      """
    )
  
  }

  // @LINE:143
  class ReverseProductReviewController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:146
    def getProductReview: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ProductReviewController.getProductReview",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "productReview/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:144
    def addProductReviewHandle: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ProductReviewController.addProductReviewHandle",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "productReviewHandle"})
        }
      """
    )
  
    // @LINE:147
    def deleteProductReview: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ProductReviewController.deleteProductReview",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "productReview/del/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:152
    def getProductReviewsJson: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ProductReviewController.getProductReviewsJson",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "api/productReviews/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:145
    def getProductReviews: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ProductReviewController.getProductReviews",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "productReviews"})
        }
      """
    )
  
    // @LINE:151
    def getProductdReviewsJson: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ProductReviewController.getProductdReviewsJson",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "api/productsReviews"})
        }
      """
    )
  
    // @LINE:155
    def updateProductReviewJson: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ProductReviewController.updateProductReviewJson",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "api/productReview_update"})
        }
      """
    )
  
    // @LINE:149
    def updateProductReviewHandle: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ProductReviewController.updateProductReviewHandle",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "updateproductReview"})
        }
      """
    )
  
    // @LINE:153
    def addProductReviewJson: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ProductReviewController.addProductReviewJson",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "api/productReview"})
        }
      """
    )
  
    // @LINE:143
    def addProductReview: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ProductReviewController.addProductReview",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "productReview"})
        }
      """
    )
  
    // @LINE:148
    def updateProductReview: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ProductReviewController.updateProductReview",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "productReview/up/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:154
    def deleteProductReviewJson: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ProductReviewController.deleteProductReviewJson",
      """
        function(id0) {
          return _wA({method:"DELETE", url:"""" + _prefix + { _defaultPrefix } + """" + "api/productReview/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
  }

  // @LINE:128
  class ReverseCartItemController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:133
    def updateCartItem: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.CartItemController.updateCartItem",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "cartItem/up/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:128
    def addCartItem: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.CartItemController.addCartItem",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "addcartItem"})
        }
      """
    )
  
    // @LINE:138
    def addCarItemJson: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.CartItemController.addCarItemJson",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "api/cartItem"})
        }
      """
    )
  
    // @LINE:136
    def getCartsItemsJson: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.CartItemController.getCartsItemsJson",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "api/cartsItems"})
        }
      """
    )
  
    // @LINE:129
    def addCartItemHandle: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.CartItemController.addCartItemHandle",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "addcartItemHandle"})
        }
      """
    )
  
    // @LINE:130
    def getCartItems: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.CartItemController.getCartItems",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "cartItems"})
        }
      """
    )
  
    // @LINE:140
    def updateCarItemJson: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.CartItemController.updateCarItemJson",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "api/cartItem_update"})
        }
      """
    )
  
    // @LINE:131
    def getCartItem: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.CartItemController.getCartItem",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "cartItem/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:132
    def deleteCartItem: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.CartItemController.deleteCartItem",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "cartItem/del/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:139
    def deleteCarItemJson: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.CartItemController.deleteCarItemJson",
      """
        function(id0) {
          return _wA({method:"DELETE", url:"""" + _prefix + { _defaultPrefix } + """" + "api/cartItem/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:137
    def getCarItemsJson: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.CartItemController.getCarItemsJson",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "api/cartItems/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:134
    def updateCartItemHandle: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.CartItemController.updateCartItemHandle",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "updatecartItem"})
        }
      """
    )
  
  }


}
