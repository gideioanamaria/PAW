/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


var studentsController = 
    {

      getStudentsAPI:  function(){
                var retApi = new GAESFappAPI();    
                var hostName = 'http://localhost:8080/RESTfulGAESF';//window.location.protocol + "//" + window.location.host;    
                retApi.setBaseURL(hostName);
                return retApi;
      },
      loadData: function(filter)
      {
          var deferred = $.Deferred();
          var studentsApi = this.getStudentsAPI();
          studentsApi.getAllStudents().done(
              function (response)
              {
                  deferred.resolve(response);
              });
          return deferred.promise();
      },
      insertItem: function (insertingItem) {
          var studentsApi = this.getStudentsAPI();
          return studentsApi.addNewStudent(insertingItem);
      },

      updateItem: function (updatingItem) {
          var studentsApi = this.getStudentsAPI();
          return studentsApi.updateStudent(updatingItem);
      },

      deleteItem: function (deletingItem) {
          var studentsApi = this.getStudentsAPI();
          return studentsApi.deleteStudent(deletingItem);
      }


}