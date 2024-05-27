$('document').ready(function(){
    $('.table #editClient').on('click',function(event){
        event.preventDefault();
        let href = $(this).attr('href')
        $.get(href,function (client,status){
            $('#editClientId').val(client.clientId);
            $('#editClientName').val(client.clientName);
            $('#editCountryId').val(client.countryId);
            $('#editStateId').val(client.stateId);
            $('#editPhone').val(client.phoneNbr);
            $('#editMobile').val(client.mobile);
            $('#editAddress').val(client.address);
            $('#editCity').val(client.city);
            $('#editWebsite').val(client.website);
            $('#editEmail').val(client.email);
        })
        $('#editModal').modal();
    });

    $('.table #deleteClient').on('click',function (event){
        event.preventDefault();
        const href = $(this).attr('href')
        $('#confirmedDelete').attr('href',href);
        $('#deleteModal').modal();
    });
});