$('document').ready(function(){
    $('.table #editCountry').on('click',function(event){
        event.preventDefault();
        let href = $(this).attr('href')

        $.get(href,function (country,status){
            $('#editcntryId').val(country.cntryId);
            $('#editCode').val(country.code);
            $('#editCapital').val(country.capital);
            $('#editDescription').val(country.description);
            $('#editNationality').val(country.nationality);
            $('#editContinent').val(country.continent);
         })
        $('#editModal').modal();
    });

    $('.table #deleteCountry').on('click',function (event){
        event.preventDefault();
        //$('#deleteModal').modal('show');
        // $('#deleteModal').modal('show',{
        //     closeExisting: false
        // });
        const href = $(this).attr('href')
        $('#confirmedDelete').attr('href',href);
        $('#deleteModal').modal();
    });
});


