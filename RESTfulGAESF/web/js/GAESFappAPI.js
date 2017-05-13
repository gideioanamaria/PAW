/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


function GAESFappAPI() {

    if (typeof GAESFappAPI.instance === 'object') {
        return GAESFappAPI.instance;
    }

    var baseURL = "localhost";
    var doAsyncGet = function (partialUrl) {
        var authorityToken = $.cookie("labman_token");
        var fullUrl = baseURL + partialUrl;
        return $.ajax({
            url: fullUrl,
            headers: {
                "Authority": authorityToken                
            },
            dataType: "json"
        });
    };

    var doAsyncPost = function (partialURL, jsonDataToPost) {
        var authorityToken = $.cookie("labman_token");
        var fullUrl = baseURL + partialURL;
        return $.ajax({
            url: fullUrl,
            type: "POST",
            headers: {
                "Authority": authorityToken,
                "Content-Type":"application/json"
                
            },
            data: JSON.stringify(jsonDataToPost),
            dataType: "json"
        });
    };

    var doAsyncDelete = function (partialURL)
    {
        var authorityToken = $.cookie("labman_token");
        var fullUrl = baseURL + partialURL;
        return $.ajax({
            url: fullUrl,
            type: "DELETE",
            headers: {
                "Authority": authorityToken               
            },            
            dataType: "json"
        });
    }

    var doAsyncPut = function (partialURL, jsonDataToPut) {
        var authorityToken = $.cookie("labman_token");
        var fullUrl = baseURL + partialURL;
        return $.ajax({
            url: fullUrl,
            type: "PUT",
            headers: {
                "Authority": authorityToken,
                "Content-Type": "application/json"
            },
            data: JSON.stringify(jsonDataToPut),            
            dataType: "json"
        });
    };

    this.setBaseURL = function (strBaseURL) {
        baseURL = strBaseURL;
    };

    this.getAllStudents = function () {
        var allStudentsReq = "/webresources/entity.student";
        return doAsyncGet(allStudentsReq);
    };
   
    this.addNewStudent = function (student) {
        var postURL = "/webresources/entity.student";
        return doAsyncPost(postURL, student);
    };
    this.deleteStudent = function (studentId)
    {
        var postURL = "/webresources/entity.student" + studentId;
        return doAsyncDelete(postURL);
    }

    this.updateStudent = function (studentData)
    {
        var putUrl = "/webresources/entity.student"+studentData.id;
        return doAsyncPut(putUrl, studentData);
    }

   
    GAESFappAPI.instance = this;
}