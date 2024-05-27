$('document').ready(function(){
    $('.table #editLocation').on('click',function(event){
        event.preventDefault();
        let href = $(this).attr('href')
        $.get(href,function (location,status){
            $('#editlocationId').val(location.locationId);
            $('#editCity').val(location.city);
            $('#editAddress').val(location.address);
            $('#editDescription').val(location.description);
            $('#editCountryId').val(location.countryId);
            $('#editStateId').val(location.stateId);
            $('#editDetails').val(location.details);
        })

        $('#editModal').modal();
    });

    $('.table #deleteLocation').on('click',function (event){
        event.preventDefault();
        const href = $(this).attr('href')
        $('#confirmedDelete').attr('href',href);
        $('#deleteModal').modal();
    });
});